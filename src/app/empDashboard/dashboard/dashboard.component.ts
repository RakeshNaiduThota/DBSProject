import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { User } from 'src/app/AppClasses/user';
import { UserLoginService } from 'src/app/AppServices/user-login.service';
import { Transaction } from '../../AppClasses/transaction';
import {Router} from '@angular/router';
import { TransactionsService } from '../../AppServices/transactions.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  transactions!:any;
  transaction:Transaction = new Transaction();
  index!:number;

  constructor(public uname: UserLoginService, private transactionService: TransactionsService, private route:Router){

  }

  ngOnInit(): void {
    
    document.getElementById("t")?.setAttribute("style","display:none");
    //console.log(UserLoginService.uname);
    this.index = 1;
    this.getTransactions();
  }

  getTransactions(){
    this.transactionService.getTransactions()
    .subscribe(data=>{
      this.transactions = data;
      console.log(data)
    },error=>alert(error.error));
  }

  passTID(e:any){
    alert(e)
  }

}
