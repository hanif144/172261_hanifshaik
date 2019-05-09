import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { RegisterService } from '../register.service';
import { SupervisorPojo } from './SupervisorPojo';

@Component({
  selector: 'app-supervisorlogin',
  templateUrl: './supervisorlogin.component.html',
  styleUrls: ['./supervisorlogin.component.css']
})
export class SupervisorloginComponent implements OnInit {
  submitted: boolean;

  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  logForm: FormGroup;
  response:any;
  spojo:SupervisorPojo=new SupervisorPojo();
 // register:RegisterPojo=new RegisterPojo();
  ngOnInit() {
    this.logForm=this.fb.group(
{
  email:['',[ Validators.required,Validators.pattern('^[a-zA-Z0-9_.+-]+@gmail.com+$')] ],
  password:['',[Validators.required,Validators.maxLength(15),Validators.minLength(6)]]
  
})
  }
  onLogin(){
    this.submitted=true;
     
      this.userService.validateSupervisor(this.spojo)
      .subscribe((response) =>
      {

        if(response!=null)
        {
          localStorage.setItem('Role','supervisor');
          localStorage.setItem('Email',response['email']);
          this.route.navigateByUrl("dailytasks");
        }
        else {
          this.route.navigateByUrl("supervisorlogin");
        }
        
        this.response=response;       
        console.log(response), error => console.log(error)});   
              
     }

}