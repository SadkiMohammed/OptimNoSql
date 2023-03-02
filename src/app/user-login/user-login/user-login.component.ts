import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/app/services/login.service';
import { User } from 'src/app/user';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.scss']
})
export class UserLoginComponent implements OnInit {

  user:User = new User();

  constructor(private loginservice: LoginService){}

  ngOnInit(): void {

  }

  userLogin(){
    console.log(this.user)
    this.loginservice.loginUser(this.user).subscribe(data =>{
      alert("Login Successfully")
    },error => alert("Enter the Correct User and Password"))
  }

}
