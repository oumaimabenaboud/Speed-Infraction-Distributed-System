import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {RadarServiceService} from "../services/radar-service.service";
@Component({
  selector: 'app-infractiondetail',
  templateUrl: './infractiondetail.component.html',
  styleUrls: ['./infractiondetail.component.css']
})
export class InfractiondetailComponent implements OnInit  {
  infractiondetail : any;
  infractionId !:number;
  constructor(private  radarService:RadarServiceService, private  router : Router,private route :ActivatedRoute) {
    this.infractionId=route.snapshot.params['infractionId']

  }

  ngOnInit(): void {

    this.radarService.getInfractionById(this.infractionId).subscribe({
      next: infractiondetail => this.infractiondetail = infractiondetail,
      error: err => console.log(err)
      });
    }}
