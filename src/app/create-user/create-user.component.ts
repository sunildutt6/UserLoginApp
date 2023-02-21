import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { countries } from '../country-data';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {
  user:User = new User();
  countries=  countries;

  constructor(private userService: UserService, private router:Router){}
    
  ngOnInit(): void {}

  onSubmit(){
    this.saveUser();
  }

  saveUser(){
    this.userService.createUser(this.user).subscribe({
      next:()=>this.gotoUserList(),
      error:(error)=>console.log(error),
       })
  }

   gotoUserList(){
     this.router.navigate(['/users']);
   }
  
   
}
