import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, Subscriber } from 'rxjs';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {

  login(username: any, password: any):  Observable<any>  {
    let params = new HttpParams().set("username",username).set("password", password);
    return this.http.get('http://localhost:8080/customer/login/',{params:params});
  
  }

  constructor( private http : HttpClient) {}

  //add user
  public addCustomer(customer : any){
    return this.http.post('http://localhost:8080/customer/',customer);
  }
}
