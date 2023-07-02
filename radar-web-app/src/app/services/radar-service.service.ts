import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Radar} from "../model/radar.model";
import {Vehicle} from "../model/vehicle.model";
import {Infraction} from "../model/infraction.model";

@Injectable({
  providedIn: 'root'
})
export class RadarServiceService {

  constructor(private http: HttpClient) { }
  public getRadars():Observable<Array<Radar>>{
    return this.http.get<Array<Radar>>("http://localhost:8888/RADAR-SERVICE/rest/radars")
  }

  public getRadarById(id: any):Observable<Radar>{
    return this.http.get<Radar>("http://localhost:8888/RADAR-SERVICE/rest/radars/"+id)
  }
  saveRadar(Radar: any) {
    return this.http.post("http://localhost:8888/RADAR-SERVICE/rest/radars", Radar)
  }
  deleteRadar(id: any) {
    return this.http.delete("http://localhost:8888/RADAR-SERVICE/rest/radars/"+id)
  }
  addInfraction(radarId: any, vehicleId: any, infraction: any) {
    return this.http.post("http://localhost:8888/RADAR-SERVICE/rest/radars/"+radarId+"/vehicles/"+vehicleId + "?speed=" + infraction, infraction)
  }

  public getVehicles():Observable<Array<Vehicle>>{
    return this.http.get<Array<Vehicle>>("http://localhost:8888/RADAR-SERVICE/rest/vehicles/all")
  }
  public getVehicleById(id: any):Observable<Vehicle>{
    return this.http.get<Vehicle>("http://localhost:8888/IMMATRICULATION-SERVICE/vehicles/"+id+"/owner")
  }

  deleteVehicle(id: any) {
    return this.http.delete("http://localhost:8888/IMMATRICULATION-SERVICE/rest/vehicles/"+id)
  }

  saveVehicle(vehicle: any) {
    return this.http.post("http://localhost:8888/IMMATRICULATION-SERVICE/rest/vehicles", vehicle)
  }

  saveOwner(owner: { birthdate: any; name: any; email: any }) {
    return this.http.post("http://localhost:8888/IMMATRICULATION-SERVICE/rest/owners", owner)
  }

  addVehicleToOwner(savedVehicle: any, savedOwner: any) {
    const requestBody = {
      vehicle: savedVehicle,
      owner: savedOwner
    };

    return this.http.post("http://localhost:8888/IMMATRICULATION-SERVICE/rest/vehicles/" + savedVehicle.id + "/owners/" + savedOwner.id, requestBody);
  }

  public getInfractions():Observable<Array<Infraction>>{
    return this.http.get<Array<Infraction>>("http://localhost:8888/RADAR-SERVICE/rest/infractions/all")
  }

  public getInfractionById(id: any):Observable<Infraction>{
    return this.http.get<Infraction>("http://localhost:8888/RADAR-SERVICE/rest/infractions/"+id)
  }

  deleteInfraction(id: any) {
    return this.http.delete("http://localhost:8888/INFRACTION-SERVICE/rest/infractions/"+id)
  }





}
