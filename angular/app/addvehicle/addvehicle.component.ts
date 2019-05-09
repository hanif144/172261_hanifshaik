import { Component, OnInit } from '@angular/core';
import  { RegisterPojo } from '../registerpojo';
import { RegisterService } from '../register.service';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { AddvehiclePojo } from '../addvehiclepojo';

@Component({
  selector: 'app-register',
  templateUrl: './addvehicle.component.html',
  styleUrls: ['./addvehicle.component.css']
})
export class AddvehicleComponent implements OnInit {
 
  addvpojo: AddvehiclePojo = new AddvehiclePojo();
  submitted = false;
  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  vehicleForm:FormGroup
  
  ngOnInit() {
    
    this.vehicleForm=this.fb.group(
      {
        vehiclenumber:['',[ Validators.required] ],
        brand:['',[Validators.required]],
        vehicleModel:['',[Validators.required]]
        
      })  }

  save() {
    this.addvpojo.email=this.userService.result;
    this.userService.addVehicle(this.addvpojo)
      .subscribe(data => console.log(data), error => console.log(error));
      this.addvpojo= new AddvehiclePojo();
      this.route.navigateByUrl("membership")
  }

  onAdd() {
    this.submitted = true;
    this.save();
  }
 
}

