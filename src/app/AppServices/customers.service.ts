import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomersService {

  baseurl:string = "http://localhost:8089/";

  constructor(private httpClient: HttpClient) { }
  
  getCustomers(): Observable<object>{
    return this.httpClient.get(this.baseurl+"customers")
  }
}
