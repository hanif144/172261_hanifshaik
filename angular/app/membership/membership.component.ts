import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RegisterService } from '../register.service';
import { MemberShipPojo } from './MemberShipPojo';

@Component({
  selector: 'app-membership',
  templateUrl: './membership.component.html',
  styleUrls: ['./membership.component.css']
})
export class MemberShipComponent implements OnInit {
  submitted:any=true
 
  constructor(private fb: FormBuilder,private route:Router,private userService: RegisterService) { }
  memForm:FormGroup
  member:MemberShipPojo=new MemberShipPojo();
  data:any
  ngOnInit() 
  {
    this.memForm = this.fb.group({
      membership: ['', [Validators.required ]],
          
   });
  }

  onMemberShip(){
    this.submitted=false
    this.member.email=this.userService.result;
    this.userService.memberShip(this.member.membership)
      .subscribe((data) =>console.log(data), error => console.log(error));
      this.route.navigateByUrl("bookwashservice")
}
}
