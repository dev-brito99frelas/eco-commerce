import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LayerHomeComponent } from './shared/layer-home/layer-home.component';
import { HeaderComponent } from './header/header.component';
import { NavComponent } from './nav/nav.component';
import { FooterComponent } from './footer/footer.component';
import { RouterModule } from '@angular/router';

//Components

@NgModule({
  declarations: [
    LayerHomeComponent,
    HeaderComponent,
    NavComponent,
    FooterComponent
  ],
  imports: [
    CommonModule,
    RouterModule
  ],
  exports:[
    LayerHomeComponent,
    HeaderComponent,
    NavComponent,
    FooterComponent
  ]
})
export class ComponentsModule { }
