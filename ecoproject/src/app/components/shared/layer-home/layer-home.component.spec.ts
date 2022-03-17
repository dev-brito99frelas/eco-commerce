import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LayerHomeComponent } from './layer-home.component';

describe('LayerHomeComponent', () => {
  let component: LayerHomeComponent;
  let fixture: ComponentFixture<LayerHomeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LayerHomeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LayerHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
