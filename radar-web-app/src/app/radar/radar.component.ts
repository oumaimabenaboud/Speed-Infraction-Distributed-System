import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { OnInit } from '@angular/core';
import {RadarServiceService} from "../services/radar-service.service";
import {Router} from "@angular/router";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
@Component({
  selector: 'app-radar',
  templateUrl: './radar.component.html',
  styleUrls: ['./radar.component.css']
})
export class RadarComponent implements OnInit {
  radars : any;
  isFormOpen: boolean = false;
  constructor(private  radarService:RadarServiceService, private  router : Router, private formBuilder: FormBuilder) { }
  ngOnInit(): void {
    this.radarService.getRadars().subscribe(
      { next:(data)=>{
          this.radars = data;
        },
        error : (err)=>{}
      });
    this.initFormBuilder();
  }
  getRadarinfractions(id: any) {
    // Navigate to the consult radar page "consultRadar/:id" with the id of the radar
    this.router.navigateByUrl("/radardetail/"+id);
  }
  deleteRadar(id: any) {
    if (confirm("Are you sure you want to delete this radar?")) {
      this.radarService.deleteRadar(id).subscribe({
        next: () => {
          window.alert("Radar deleted successfully!");
          window.location.reload();
        },
        error: err => console.log(err)
      });
    }
  }



  openForm() {
    this.isFormOpen = true;
  }

  closeForm() {
    this.isFormOpen = false;
  }
  public newRadarForm! : FormGroup;

  saveNewRadar() {
    let radar = this.newRadarForm.value;
    this.radarService.saveRadar(radar).subscribe({
      next: () => {
        window.location.reload();
      }
    });
  }

  private initFormBuilder() {
    this.newRadarForm = this.formBuilder.group({
      radar_maxSpeed: this.formBuilder.control('', [Validators.required, Validators.min(0)]),
      longitude: this.formBuilder.control('', [Validators.required]),
      latitude: this.formBuilder.control('', [Validators.required])
    });
  }
}
