import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';
import { User } from '../AppClasses/user';

@Injectable({
  providedIn: 'root'
})
export class UserLoginService {
  baseurl:string = "http://localhost:8089/";
  isloggedIn:boolean = false;
  constructor(private httpClient: HttpClient) { }
  isLog:boolean=true;
  UserLogin(user: User):Observable<object> {
    console.log(user);
    this.isLog=false;
      return this.httpClient.post(this.baseurl+"user", user);
  }
   
  public get value() : boolean {
    return this.isloggedIn;
  }
  
}
