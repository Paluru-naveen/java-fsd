
import { Component, ViewChild, ElementRef, OnInit } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { FormGroup, FormControl, FormArray, NgForm } from '@angular/forms'



@Component({
  selector: 'app-valid',
  templateUrl: './valid.component.html',
  styleUrls: ['./valid.component.css']
})
export class ValidComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
    submit(form:any){
      var firstName = form.firstName;
      console.log(firstName);
  
      var lastName = form.lastName;
      console.log(lastName);
  
      var comment = form.comment;
      console.log(comment);
    
  }
}
