import { Component, OnInit } from '@angular/core';
import { UserLoginService } from 'src/app/AppServices/user-login.service';
import { User } from '../../AppClasses/user';
import {Router} from '@angular/router';
@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginpageComponent implements OnInit {

  user:User = new User();

  constructor(private userloginservice: UserLoginService, private route:Router) { }
  
  ngOnInit(): void {
  }
  userLogin(){
    console.log(this.user)
    this.userloginservice.UserLogin(this.user)
    .subscribe(data=>{
      this.userloginservice.isloggedIn = true;
      document.getElementById("t")?.setAttribute("style","display:none");
      this.route.navigate(['/empDashboard/'+this.user.euname]);
    },error=>alert("not passed"));
  }
}
