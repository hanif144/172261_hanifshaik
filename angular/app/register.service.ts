import { Injectable, Output } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
 
@Injectable({
  providedIn: 'root'
})
export class RegisterService {
 
  value: any;
 
  
  
  private login = 'http://localhost:7999/login';
  private register = 'http://localhost:7999/register';
  private vehicle = 'http://localhost:7999/addvehicle';
  private bookwash = 'http://localhost:7999/bookwash';
  private payment1 = 'http://localhost:7999/payment';
  private membership = 'http://localhost:7999/membership';
  private additionalpurchase = 'http://localhost:7999/purchaseadd';
  private supervisorlogin = 'http://localhost:7999/supervisorlogin';
  private dailytask1 = 'http://localhost:7999/dailytasks';
  private addwasher = 'http://localhost:7999/addwasherman';

  result:any;

  constructor(private http: HttpClient) { }
 
  createRegister(reg: Object): Observable<Object> {
    console.log(reg)
    return this.http.post(`${this.register}` + `/user/add`, reg);
  }

  validateUser(login: Object): Observable<Object>{
    return this.http.post(`${this.login}` + `/user/login`, login);
  }
  addVehicle(addvpojo: Object): Observable<Object> {
    
    console.log(addvpojo)
    console.log(`${this.vehicle}` + `/vehicleadd`)
    return this.http.post(`${this.vehicle}` + `/vehicleadd`, addvpojo);
  }
  bookservice(bookpojo: Object): Observable<Object> {
   
      return this.http.post(`${this.bookwash}` + `/bookWash`, bookpojo);
    }
     memberShip(member: string): Observable<Object> {
   console.log(member)
   console.log(`${this.membership}/`+member)
       return this.http.get(`${this.membership}/`+`${member}`);
     }
    payment(paypojo: Object): Observable<Object> {
   console.log(paypojo)
      return this.http.post(`${this.payment1}` + `/payment`, paypojo);
      
    }
    additionalPurchase(addpurchase: Object): Observable<Object> {
      console.log(addpurchase)
         return this.http.post(`${this.additionalpurchase}` + `/washservice`, addpurchase);
    }
    validateSupervisor(spojo: Object): Observable<Object> {
      return this.http.post(`${this.supervisorlogin}` + `/supervisor`,spojo);
    }
    dailytasks(results: Object) :Observable<Object> {
     
      return this.http.get(`${this.dailytask1}` + `/getallusers`,results);
    }
    createUser(addwasher: Object): Observable<Object> {
      console.log(addwasher)
      return this.http.post(`${this.addwasher}` + `/add`,addwasher);
    }
    userDetails(email:string) {
     
      console.log("inrespoonse");
      console.log(email)
    this.result=email;
    }

    getUserDetailsByBookWash(): Observable<any>{
      
      return this.http.get(`${this.bookwash}` + `/user`+`/all`);
    }

    getUserDetailsByAddVehicle(): Observable<any>{
      
      return this.http.get(`${this.vehicle}` + `/user`+`/vehicle`);
    }

    getUserDetailsByMembership(): Observable<any>{
      
      return this.http.get(`${this.membership}` + `/user`+`/membership`);
    }

    getUserDetailsByAdditionalPurchase(): Observable<any>{
      
      return this.http.get(`${this.additionalpurchase}` + `/user`+`/additionalpurchase`);
    }

    getUserDetailsByPayment(): Observable<any>{
      
      return this.http.get(`${this.payment1}` + `/user`+`/payment`);
    }
   
}

