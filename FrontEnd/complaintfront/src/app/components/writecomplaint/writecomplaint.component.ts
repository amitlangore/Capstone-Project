import { Component, OnInit } from '@angular/core';
import * as ClassicEditor from '@ckeditor/ckeditor5-build-classic';

@Component({
  selector: 'app-writecomplaint',
  templateUrl: './writecomplaint.component.html',
  styleUrls: ['./writecomplaint.component.css']
})
export class WritecomplaintComponent implements OnInit {
  public Editor = ClassicEditor;

  constructor() { }

  ngOnInit(): void {
  }

}
