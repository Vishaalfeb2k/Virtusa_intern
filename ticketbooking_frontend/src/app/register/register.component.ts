import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../../app/user';
import { FormGroup, FormBuilder ,NgForm, Validators} from '@angular/forms';
import { HardcodedAuthenticationServiceService } from '../service/hardcoded-authentication-service.service';
import { NgModel } from '@angular/forms';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  //  email='vishaalfeb2000@gmail.com'
  //  password=''
  //  repeatpass=''
  //  errorMessage='Invalid Credentials'
  //  invalidlogin=false
  // angForm: FormGroup;
  // user:User;
  constructor(private router:Router,private fb:FormBuilder,private service:HardcodedAuthenticationServiceService) {
   
    //  this.angForm = this.fb.group({
    //  username: ['',[Validators.required]],
    //  password: ['',[Validators.required]],
    //  repeat:['']
    //  });
     }
     user:User =new User("","","");

  ngOnInit(): void {
  }
  handleRegister()
  {
    //console.log(this.user);
    // console.log(this.angForm.get('password').value);
    // console.log(this.angForm);
    // this.service.register(this.angForm);
    // this.service.register(this.angForm).subscribe((data: 
    //   {}) => {
    //         console.log(data)
    //         this.router.navigate(['login'])
    //       })
    //       alert('SUCCESS!! :-)\n\n' + 
    //   JSON.stringify(this.angForm.getRawValue()))
    this.service.register(this.user).subscribe(
      data=>{
        console.log(data)
      }
    )
    this.router.navigate(['login']);
   }
  
}
