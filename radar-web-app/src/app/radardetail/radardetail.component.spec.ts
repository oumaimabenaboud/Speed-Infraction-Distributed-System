import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RadardetailComponent } from './radardetail.component';

describe('RadardetailComponent', () => {
  let component: RadardetailComponent;
  let fixture: ComponentFixture<RadardetailComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RadardetailComponent]
    });
    fixture = TestBed.createComponent(RadardetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
