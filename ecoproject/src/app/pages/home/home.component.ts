import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  public imgsOne:string = "../../../assets/vaso2.png";
  public imgsTwo:string = "../../../assets/vaso1.png";

  constructor() { }

  ngOnInit(): void {
  }

}
