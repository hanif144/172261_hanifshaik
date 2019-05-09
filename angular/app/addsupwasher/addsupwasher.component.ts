import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { RegisterService } from '../register.service';
import { Addsupwasher } from './Addsupwasher';

@Component({
  selector: 'app-addsupwasher',
  templateUrl: './addsupwasher.component.html',
  styleUrls: ['./addsupwasher.component.css']
})
export class AddsupwasherComponent implements OnInit {

  regForm: FormGroup;
  submitted:boolean=false;
   response:any;

  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  addwasher:Addsupwasher=new Addsupwasher();
  ngOnInit() {
  }


  onAdd(){
    this.submitted=true;
      console.log("in add() method")
      console.log(this.addwasher)
      this.userService.createUser(this.addwasher).subscribe((response) =>{ 
            this.response=response
            console.log(this.response.password)});
           // this.route.navigateByUrl("login");
       // this.userAccount = new UserAccount();
        //console.log(this.userAccount)
    
    
     }
}
