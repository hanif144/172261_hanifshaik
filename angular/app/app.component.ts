import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'CarWash';

  readValue(key){
    return localStorage.getItem(key);
  }

  logout(){
    localStorage.setItem('Role','nothing');
  }

  supervisorlogout() {
    localStorage.setItem('Role','none');
  }

}
