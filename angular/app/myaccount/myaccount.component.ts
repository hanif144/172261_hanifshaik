import { Component, OnInit, Input } from '@angular/core';
import { RegisterService } from '../register.service';
import { Router } from '@angular/router';
import { FormBuilder } from '@angular/forms';
import { LoginPojo } from '../LoginPojo';
import { MyaccountPojo } from './MyaccountPojo';
import { AddvehiclePojo } from '../addvehiclepojo';
import { PaymentPojo } from '../payment/PaymentPojo';
import { MemberShipPojo } from '../membership/MemberShipPojo';
import { AdditinalServicePojo } from '../purchaseaddservicepojo';

@Component({
  selector: 'app-myaccount',
  templateUrl: './myaccount.component.html',
  styleUrls: ['./myaccount.component.css']
})
export class MyaccountComponent implements OnInit {
  bookwashresult: MyaccountPojo[];
  vehicleresult:AddvehiclePojo[];
  membershipresult:MemberShipPojo[];
  addpurchaseresult:AdditinalServicePojo[];
  paymentresult:PaymentPojo[];

  @Input() useremail;
  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  login:LoginPojo=new LoginPojo();
  
  ngOnInit() {
    
   this.myAccountDetailsBookwash();
   this.myAccountDetailsVehicle();
   this.myAccountDetailsMembership()
   this.myAccountDetailsAdditionalPurchase()
   this.myAccountDetailsPayment() 

  }
  myAccountDetailsBookwash()
  {
    this.userService.getUserDetailsByBookWash().subscribe((response) =>{  
    this.bookwashresult=response as MyaccountPojo[];
  }); 
 }
 myAccountDetailsVehicle()
  {
    this.userService.getUserDetailsByAddVehicle().subscribe((response) =>{  
    this.vehicleresult=response as AddvehiclePojo[];
  });
}
  myAccountDetailsMembership()
  {
    this.userService.getUserDetailsByMembership().subscribe((response) =>{  
    this.membershipresult=response as MemberShipPojo[];
  }); 
}
  myAccountDetailsAdditionalPurchase()
  {
    this.userService.getUserDetailsByAdditionalPurchase().subscribe((response) =>{  
    this.addpurchaseresult=response as AdditinalServicePojo[];
  }); 
}
  myAccountDetailsPayment()
  {
    this.userService.getUserDetailsByPayment().subscribe((response) =>{  
    this.paymentresult=response as PaymentPojo[];
  }); 
}
 
  read(){
   return localStorage.getItem('Email');
  }

}
