import { Component, OnInit, Output } from '@angular/core';
import { FormGroup,  FormBuilder,  Validators } from '@angular/forms';
import { Router } from '@angular/router';
import  { LoginPojo } from '../LoginPojo'
import { RegisterPojo } from '../registerpojo';
import { RegisterService } from '../register.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
title:"Car wash"
  submitted: boolean=false;
 
  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  logForm: FormGroup;
  response:any;
  value:any;
  useremail : any;
  login:LoginPojo=new LoginPojo();
  register:RegisterPojo=new RegisterPojo();
  
  ngOnInit() {
    this.logForm=this.fb.group(
{
  email:['',[ Validators.required,Validators.pattern('^[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
  password:['',[Validators.required,Validators.maxLength(15),Validators.minLength(6)]]
  
})
}
@Output() onLogin() : any {
    this.submitted=true;  
    this.userService.validateUser(this.login)
    .subscribe((response )=>
      {
        if(response!=null)
        {
          localStorage.setItem('Role','customer');
          localStorage.setItem('Email',response['email']);
          this.route.navigateByUrl("addvehicle");
          
        }
        else{
          this.route.navigateByUrl("register");
        }
        this.response=response;
        this.value=response;
        console.log(this.value.email)
         this.useremail = this.value.email
        
        
         this.userService.userDetails(this.useremail);
        /*  return this.useremail; */
         /* this.getUser(this.value.email);
        console.log(this.response), error => console.log(error);
       */
      });

      }
      /* getUser(email : string) {
        this.userService.getUserByEmail(email).subscribe((response)=> 
        console.log(response));
      } */
}