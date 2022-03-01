import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders } from '@angular/common/http'
import {Customer} from "../../customer";
import {Observable} from 'rxjs';

@Injectable()
export class CustomerService{
  private usersUrl: 'http://localhost:8080/users';

  constructor(private http: HttpClient) {}

  public findAll(): Observable<any>{
    return this.http.get(this.usersUrl,{responseType:'json'});
  }
  public save(customer:Customer){
    return this.http.post<Customer>(this.usersUrl,customer)
  }

}
