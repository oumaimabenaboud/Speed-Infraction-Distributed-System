import {Infraction} from "./infraction.model";

export interface Radar{
  id : number,
  radar_maxSpeed : number,
  longitude : number,
  latitude : number,
  infractions : Array<Infraction>,
  number_infractions : number
}
