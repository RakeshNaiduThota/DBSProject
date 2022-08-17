import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';
import { Transaction } from '../AppClasses/transaction';

@Injectable({
  providedIn: 'root'
})
export class TransactionsService {

  baseurl:string = "http://localhost:8089/";

  constructor(private httpClient: HttpClient) { }
  isLog:boolean=true;
  VerifySender(accountNumber: Transaction):Observable<object> {
    console.log(accountNumber);
     return this.httpClient.post(this.baseurl+"verifySender", {accountNumber: accountNumber});
  }
  verifyBIC(BIC: Transaction):Observable<object> {
    console.log(BIC);
     return this.httpClient.post(this.baseurl+"verifyBIC", {bic: BIC});
  }
  sendAmount(transaction: Transaction): Observable<object>{
    console.log(transaction)
    return this.httpClient.post(this.baseurl+"uploadTransaction", transaction);
  }
  updateBalance(transaction: any): Observable<object>{
    return this.httpClient.post(this.baseurl+"updateBalance", transaction);
  }
  getTransactions(): Observable<object>{
    return this.httpClient.get(this.baseurl+"transactions")
  }
}
