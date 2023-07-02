import { Component, OnInit } from '@angular/core';
import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  username='';

  constructor(private keycloakService: KeycloakService){

  }
  ngOnInit(): void {
    this.intializeOption();
  }
  intializeOption() {
    this.username = this.keycloakService.getUsername();
  }


}
