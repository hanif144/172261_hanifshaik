import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { RegisterService } from '../register.service';
import {DailytasksPojo } from './DailytasksPojo';

@Component({
  selector: 'app-dailytasks',
  templateUrl: './dailytasks.component.html',
  styleUrls: ['./dailytasks.component.css']
})
export class DailytasksComponent implements OnInit {
  title:"Car wash"
      submitted: boolean=false;
     
      constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
     logForm: FormGroup;
      results: DailytasksPojo[];
     
 
    // register:RegisterPojo=new RegisterPojo();
      ngOnInit() {
        this.logForm=this.fb.group({
     
    })
   
  }
  onService()
  {
    this.submitted=true;  
    this.userService.dailytasks(this.results)
      .subscribe((response) =>
      {
        this.results=response as DailytasksPojo[];
        console.log(response), error => console.log(error)});  
  }

}