import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HardcodedAuthenticationServiceService } from '../service/hardcoded-authentication-service.service';
import { User } from '../user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  // username='vishaal'
  // password=''
  errorMessage='Invalid Credentials'
  invalidlogin=false

  constructor(private router:Router,private service:HardcodedAuthenticationServiceService) { }
user:User=new User("","","");

  ngOnInit(): void {
  }
  handleLogin()
{
  // this.service.temp().subscribe(
  //   data=>
  //   {
  //     console.log(data)
  //   }
  // )
// console.log(this.service.temp());
  // console.log(data)
// })
  let resp=this.service.authenticate(this.user.username).subscribe(
    data=>{
      if(data===null)
      {
        alert("incorrect username or password");
      }
      else if(data.password===this.user.password)
      {
          this.router.navigate(['main',this.user]);
          sessionStorage.setItem('username',this.user.username);
      }
     else{
        alert("incorrect username or password");
      }
    },
   
  )
  // if(resp===null)
  // alert("incorrect");
  // console.log(this.user);
  //  if(this.username==="vishaal"&&this.password==="dummy")
  //  {
  //    if(this.hardcodedAuthenticationServiceService.authenticate(this.username, this.password)){
  //   this.router.navigate(['welcome',this.username])
  //   this.invalidlogin=false
  // }
  // else{
  //    this.invalidlogin=true

  // }
}
}

 
