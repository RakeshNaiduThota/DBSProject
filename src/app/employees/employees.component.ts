import { Component, OnInit } from '@angular/core';
import { CustomersService } from '../AppServices/customers.service'; 
@Component({
  selector: 'app-employees',
  templateUrl: './employees.component.html',
  styleUrls: ['./employees.component.css']
})
export class EmployeesComponent implements OnInit {
  customer!:any;
  
  constructor(private customerService: CustomersService) { }

  ngOnInit(): void {
    document.getElementById("t")?.setAttribute("style","display:none");
    this.getCustomers();
  }

  getCustomers(){
    this.customerService.getCustomers().subscribe(data =>{
      this.customer = data;
      console.log(data);
    })
  }

}
