import { Component } from "@angular/core";

export class CarService {
     
    id: number;
    date: Date;
    first_name : String;
    last_name: String;
    gender: string;
    phone_no:number;
    dest_price:string
    day: string;
    time: number;
   
}
@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
  })
  export class AppComponent {
    title = ' Search';
    searchText;
    carService = [
      { id: 1, name: 'Smartphone' },
      { id: 2, name: 'Headphone' },
      { id: 3, name: 'Bike' },
      { id: 4, name: 'Laptop' },
      { id: 5, name: 'TV' },
      { id: 6, name: 'PC' },
      { id: 7, name: 'Car' }
    ];
  }