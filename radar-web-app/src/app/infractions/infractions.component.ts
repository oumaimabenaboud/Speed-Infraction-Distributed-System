import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { OnInit } from '@angular/core';
import {Router} from "@angular/router";
import {RadarServiceService} from "../services/radar-service.service";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
@Component({
  selector: 'app-infractions',
  templateUrl: './infractions.component.html',
  styleUrls: ['./infractions.component.css']
})
export class InfractionsComponent implements OnInit{
  infractions : any;
  err!:any;
  isFormOpen: boolean = false;
    constructor(private radarService:RadarServiceService, private  router : Router, private formBuilder: FormBuilder) { }

    ngOnInit(): void {
      this.radarService.getInfractions().subscribe(
        { next:(data)=>{
            this.infractions = data;
          },
          error : (err)=>{ console.log(err);}
        });
      this.initFormBuilder();
    }
      getInfractionDetail(i: any) {
        this.router.navigateByUrl("/infractiondetail/"+i.id)

      }
  deleteInfraction(id: any) {
    // Get confirmation from the user
    if (confirm("Are you sure you want to delete this infraction?")) {
      // Delete the infraction
      this.radarService.deleteInfraction(id).subscribe({
        next: () => {
          window.alert("Infraction deleted successfully!");
          // Refresh the page
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
  public newInfractionForm! : FormGroup;

  saveNewInfraction() {
    let radarId = this.newInfractionForm.get("radarId")?.value;
    let vehicleId = this.newInfractionForm.get("vehicleId")?.value;
    let vehicleSpeed = this.newInfractionForm.get("vehicleSpeed")?.value;
    this.radarService.addInfraction(radarId, vehicleId, vehicleSpeed).subscribe({
      next: () => {
        // Refresh the page
        window.location.reload();
      }
    });
    console.log("DEBUG")
  }

  private initFormBuilder() {
    this.newInfractionForm = this.formBuilder.group({
      radarId: this.formBuilder.control('', [Validators.required]),
      vehicleId: this.formBuilder.control('', [Validators.required]),
      vehicleSpeed: this.formBuilder.control('', [Validators.required])
    });
  }
}
