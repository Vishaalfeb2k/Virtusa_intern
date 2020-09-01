import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../user';
//import { User } from '../../app/user';
@Injectable({
  providedIn: 'root'
})
export class HardcodedAuthenticationServiceService {
  var:string;
  constructor(private http:HttpClient) { 

  }
   authenticate(username)
   {
    return this.http.get<User>(`http://localhost:8080/findbyusername/${username}`);
   }
  register(user)
  {
    console.log(user);
    return this.http.post<User>('http://localhost:8080/register',user,{responseType:'text' as 'json'});
  }
  // temp()
  // {
  
  // return this.http.get<string>('http://localhost:8080/hello',{responseType:'text' as 'json'});
  // }
}
