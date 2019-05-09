import { Component, OnInit } from '@angular/core';
import { BookwashPojo } from 'src/bookwashpojo';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { RegisterService } from '../register.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-bookwashservice',
  templateUrl: './bookwashservice.component.html',
  styleUrls: ['./bookwashservice.component.css']
})
export class BookwashserviceComponent implements OnInit {

  
 
  bookpojo: BookwashPojo = new BookwashPojo();
  submitted = false;
  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  bookForm:FormGroup
  
  ngOnInit() {
    
    this.bookForm=this.fb.group(
      {
        location:['',[ Validators.required] ],
        date:['',[Validators.required]],
        
      })  }

  save() {
    this.bookpojo.email=this.userService.result;
    this.userService.bookservice(this.bookpojo)
      .subscribe(data => console.log(data), error => console.log(error));
    this.bookpojo= new BookwashPojo();
   
  }

  onAdd() {
    this.submitted = true;
    this.save();
    this.route.navigateByUrl("additionalservice")

  }
 
}

