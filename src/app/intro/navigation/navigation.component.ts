import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/AppClasses/user';
import { UserLoginService } from 'src/app/AppServices/user-login.service';
@Component({
  selector: 'app-navigation',
  templateUrl: './navigation.component.html',
  styleUrls: ['./navigation.component.css']
})
export class NavigationComponent  {
  isLog!:boolean;
  constructor(private api:UserLoginService) {
    this.isLog=true;
  }

  ngOnInit(): void {
    // this.isLog=this.api.isLog;
    // isloggedIn = UserLoginService.isloggedIn;
  }
  ngAfterViewInit() {
    this.isLog=this.api.isLog;
  }
  
  
}
