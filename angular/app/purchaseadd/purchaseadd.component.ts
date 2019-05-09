import { Component, OnInit } from '@angular/core';
import { AdditinalServicePojo } from '../purchaseaddservicepojo';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RegisterService } from '../register.service';

@Component({
  selector: 'app-purchaseadd',
  templateUrl: './purchaseadd.component.html',
  styleUrls: ['./purchaseadd.component.css']
})
export class PurchaseaddComponent implements OnInit {
 
  addpurchase: AdditinalServicePojo = new AdditinalServicePojo();
  submitted:any=true
  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  additionalPurchaseForm:FormGroup

  ngOnInit() {
    this.additionalPurchaseForm=this.fb.group(
      {
        typeOfVechile:['',[ Validators.required] ],
        partOfDay:['',[Validators.required]],
        dirtyVechile:['',[Validators.required]]

      })  }

    save() {
     
        this.addpurchase= new AdditinalServicePojo();
    }

    onAdd() {
      this.submitted = true;
      this.addpurchase.email=this.userService.result;
      this.userService.additionalPurchase(this.addpurchase)
      .subscribe(data => console.log(data), error => console.log(error));
      this.route.navigateByUrl("payment")
  
    }
}
