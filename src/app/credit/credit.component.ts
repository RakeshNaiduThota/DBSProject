import { Component, OnInit } from '@angular/core';
import { Transaction } from '../AppClasses/transaction';
import {Router} from '@angular/router';
import { TransactionsService } from '../AppServices/transactions.service';
@Component({
  selector: 'app-credit',
  templateUrl: './credit.component.html',
  styleUrls: ['./credit.component.css']
})
export class CreditComponent implements OnInit {


  transaction:Transaction = new Transaction();

  constructor(private transactionService: TransactionsService, private route:Router) { }

  ngOnInit(): void {
    document.getElementById("t")?.setAttribute("style","display:none");
    
  }

  updateBalance(){
    let temp = {
      balance: this.transaction.finalBalance,
      accountNumber: this.transaction.senderAccNo
    }
    this.transactionService.updateBalance(temp).subscribe(data => {
      alert("updated customer balance")
    }, error => {alert("failed")})
  }

  sendAmount(){
    this.transactionService.sendAmount(this.transaction)
    .subscribe(data=>{
      this.updateBalance()
      alert('success');

    },error=>alert(error.error));
  }
  sendAccNo(e:any){
    let temp = {
      name!:"",
    }
    this.transactionService.VerifySender(e.target.value).subscribe(data => {
      temp = {...temp, ...data}
      this.transaction.senderName = temp.name;
      this.transaction = { ...this.transaction, ...data}
    });
  }

  sendBIC(e:any){
    this.transactionService.verifyBIC(e.target.value).subscribe(data => {
      console.log(data)
      this.transaction = { ...this.transaction, ...data}
    })
  }

  valAmount(e:any){
    if(e.target.value >= this.transaction.balance){
      alert("no min balance")
    }else if(e.target.value <= (<number>this.transaction.balance + 3000)){
      this.transaction.amount = e.target.value;
      this.transaction.transferFee = e.target.value * 0.25;
      this.transaction.finalBalance = <number>this.transaction.balance - <number>this.transaction.amount - <number>this.transaction.transferFee
    }else{
      alert("insufficient balance")
    }
  }


}
