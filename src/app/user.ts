import { Address } from "./address";

export class User{
     id:number;
     firstName:string;
     lastName:string;
     gender:string;
     email:string;
     password:string;
     address = new Address();
 
}