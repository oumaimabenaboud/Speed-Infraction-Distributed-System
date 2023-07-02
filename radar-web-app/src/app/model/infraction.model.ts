import {Vehicle} from "./vehicle.model";
export interface Infraction{
  id : number,
  date : string,
  radarId : number,
  vehicleId : number,
  vehicle : Vehicle
  vehicle_speed : number,
  radar_maxSpeed : number,
  fineAmount : number,
}
