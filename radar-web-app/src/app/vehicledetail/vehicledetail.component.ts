import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";
import {RadarServiceService} from "../services/radar-service.service";

@Component({
  selector: 'app-vehicledetail',
  templateUrl: './vehicledetail.component.html',
  styleUrls: ['./vehicledetail.component.css']
})
export class VehicledetailComponent implements OnInit  {
  vehicledetail : any;
  vehicleId !:number;
  constructor(private  radarService:RadarServiceService, private  router : Router,private route :ActivatedRoute) {
    this.vehicleId=route.snapshot.params['vehicleId']

  }

  ngOnInit(): void {
    this.radarService.getVehicleById(this.vehicleId).subscribe({
      next: vehicledetail => this.vehicledetail = vehicledetail,
      error: err => console.log(err)
      });
  }}
