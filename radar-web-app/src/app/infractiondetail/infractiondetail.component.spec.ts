import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InfractiondetailComponent } from './infractiondetail.component';

describe('InfractiondetailComponent', () => {
  let component: InfractiondetailComponent;
  let fixture: ComponentFixture<InfractiondetailComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [InfractiondetailComponent]
    });
    fixture = TestBed.createComponent(InfractiondetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
