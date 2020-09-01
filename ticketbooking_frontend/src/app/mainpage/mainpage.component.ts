import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-mainpage',
  templateUrl: './mainpage.component.html',
  styleUrls: ['./mainpage.component.css']
})
export class MainpageComponent implements OnInit {
username=''
  constructor(private route:ActivatedRoute,private router:Router) { }

  ngOnInit(): void {
    this.username=this.route.snapshot.params['username'];
  }
  getMovieName(value :any) {
    console.log(value);
    this.router.navigate(['moviedetails']);
    }

}
