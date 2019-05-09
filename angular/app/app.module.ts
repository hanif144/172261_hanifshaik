import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { RouterModule } from '../../node_modules/@angular/router';
import { AboutComponent } from './about/about.component';
import { HttpClientModule } from '../../node_modules/@angular/common/http';
import { FormsModule,ReactiveFormsModule } from '../../node_modules/@angular/forms';
import { LoginComponent } from './login/login.component';
import { AddvehicleComponent } from './addvehicle/addvehicle.component';
import { BookwashserviceComponent } from './bookwashservice/bookwashservice.component';
import { PaymentComponent } from './payment/payment.component';
import { CarouselModule } from 'ngx-bootstrap/carousel';
import { ContactComponent } from './contact/contact.component';
import { MemberShipComponent } from './membership/membership.component';
import { PurchaseaddComponent } from './purchaseadd/purchaseadd.component';
import { SupervisorloginComponent } from './supervisorlogin/supervisorlogin.component';
import { DailytasksComponent } from './dailytasks/dailytasks.component';
import { AddsupwasherComponent } from './addsupwasher/addsupwasher.component';
import { MyaccountComponent } from './myaccount/myaccount.component';


@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    AboutComponent,
    LoginComponent,
    AddvehicleComponent,
    BookwashserviceComponent,
    PaymentComponent,
    ContactComponent,
    MemberShipComponent,
    PurchaseaddComponent,
    SupervisorloginComponent,
    DailytasksComponent,
    AddsupwasherComponent,
    MyaccountComponent
  
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,FormsModule,ReactiveFormsModule,
    RouterModule.forRoot([
     {path:'register',component:RegisterComponent},
     {path:'about',component:AboutComponent},
     {path:'login',component:LoginComponent},
     {path:'addvehicle',component:AddvehicleComponent},
     {path:'bookwashservice',component:BookwashserviceComponent},
     {path:'payment',component:PaymentComponent},
     {path:'contact',component:ContactComponent},
     {path:'membership',component:MemberShipComponent},
     {path:'additionalservice',component:PurchaseaddComponent},
     {path:'supervisorlogin',component:SupervisorloginComponent},
     {path:'dailytasks',component:DailytasksComponent},
     {path:'addsupwasher',component:AddsupwasherComponent},
     {path:'myaccount',component:MyaccountComponent}
    
    ]),
    CarouselModule.forRoot()
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
