import { Component, OnInit } from '@angular/core';
import {Customer} from "../../customer";
import {CustomerService} from "../service/customer.service";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {
  customers:any;
  // customers : Customer [];
  title:string;

  constructor(private customerService: CustomerService) { }

  ngOnInit(): void {
    this.customerService.findAll().subscribe(data=>{
      this.customers = data;
      this.title= "I want to be shown!n"
    })
  }
  reloadData(){
    this.customers = this.customerService.findAll();
  }

}
