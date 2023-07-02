import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {VehiclesComponent} from "./vehicles/vehicles.component";
import {InfractionsComponent} from "./infractions/infractions.component";
import { InfractiondetailComponent } from './infractiondetail/infractiondetail.component';
import {VehicledetailComponent} from "./vehicledetail/vehicledetail.component";
import {RadarComponent} from "./radar/radar.component";
import {RadardetailComponent} from "./radardetail/radardetail.component";
import {HomeComponent} from "./home/home.component";

const routes: Routes = [

  { path: '', redirectTo: 'home', pathMatch: 'full' },
  {
  path : "home",component:HomeComponent
  },  {
  path : "vehicles",component:VehiclesComponent
  },
  {
      path : "infractions",component:InfractionsComponent
   },
     {
         path : "infractiondetail/:infractionId",component:InfractiondetailComponent
      },
  {
    path : "vehicledetail/:vehicleId",component:VehicledetailComponent
  },
  {
    path : "radars",component:RadarComponent
  },  {
    path : "radardetail/:radarId",component:RadardetailComponent
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
