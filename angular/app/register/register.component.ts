import { Component, OnInit } from '@angular/core';
import  { RegisterPojo } from '../registerpojo';
import { RegisterService } from '../register.service';
import { Validators, FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  register: RegisterPojo = new RegisterPojo();
  submitted = false;
  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  regForm: FormGroup;

  ngOnInit() {
    this.regForm=this.fb.group(
{
  email:['',[ Validators.required,Validators.pattern('^[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
  password:['',[Validators.required,Validators.maxLength(15),Validators.minLength(6)]],
  repeatpassword:['',[Validators.required,Validators.maxLength(15),Validators.minLength(6)]]
  
})
  }

  save() {
    this.userService.createRegister(this.register)
      .subscribe(data => console.log(data), error => console.log(error));
      this.register = new RegisterPojo();
   
  }

  onSubmit() {
    this.submitted = true;
    this.save();
    this.route.navigateByUrl("login")

  }
 
}

