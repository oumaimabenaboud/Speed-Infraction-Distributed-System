import {Component, OnInit} from '@angular/core';
import {RadarServiceService} from "../services/radar-service.service";
import {ActivatedRoute, Router} from "@angular/router";
import {FormBuilder} from "@angular/forms";

@Component({
  selector: 'app-radardetail',
  templateUrl: './radardetail.component.html',
  styleUrls: ['./radardetail.component.css']
})
export class RadardetailComponent implements OnInit {
  radarId !:number;
  radar : any;
  infractionId: any;
  infractiondetail:any;
  isFormOpen: boolean = false;
  constructor(private  radarService:RadarServiceService, private  router : Router, private formBuilder: FormBuilder,private route :ActivatedRoute) {
    this.radarId=route.snapshot.params['radarId']
  }
  ngOnInit(): void {
    this.radarService.getRadarById(this.radarId).subscribe({
      next: radar => this.radar = radar,
      error: err => console.log(err)
      });
    this.initFormBuilder();
  }

  deleteInfraction(infractiondetail: any) {
    // Get confirmation from the user
    if (confirm("Are you sure you want to delete this infraction?")) {
      // Delete the infraction
      this.radarService.deleteInfraction(infractiondetail.id).subscribe({
        next: () => {
          window.alert("Infraction deleted successfully!");
          // Refresh the page
          window.location.reload();
        },
        error: err => console.log(err)
      });
    }
  }
  openForm(infraction:any) {
    this.isFormOpen = true;
    this.infractiondetail=infraction;
  }

  closeForm() {
    this.isFormOpen = false;
  }
  private initFormBuilder() {

  }
}
