import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template: `
    <app-layer-home>
      <app-header></app-header>
      <app-nav [arrayNav]="arrayDelinks"></app-nav>
      <router-outlet></router-outlet>
      <app-footer></app-footer>
    </app-layer-home>
  `,
})
export class AppComponent {
  title = 'ecoproject';
  public arrayDelinks:Array<string>= ["home","buy","new"];
}
