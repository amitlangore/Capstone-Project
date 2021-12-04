import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WritecomplaintComponent } from './writecomplaint.component';

describe('WritecomplaintComponent', () => {
  let component: WritecomplaintComponent;
  let fixture: ComponentFixture<WritecomplaintComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WritecomplaintComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WritecomplaintComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
