import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'EventBinding';
  public name="india and enjoy a lot";
  public value="";
  public topic="data binding";
  
  onclick(){
    console.log("thank you for subscribing");
  }
}
