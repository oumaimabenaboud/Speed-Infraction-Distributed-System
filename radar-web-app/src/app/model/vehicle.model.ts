import {Owner} from "./owner.model";

export interface Vehicle{
  id : number,
  registration_plate_number : string,
  brand : string,
  tax_horsepower : number,
  vehicle_model : string,
  owner : Owner,
}
