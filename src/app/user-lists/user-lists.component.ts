import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';


@Component({
  selector: 'app-user-lists',
  templateUrl: './user-lists.component.html',
  styleUrls: ['./user-lists.component.css']
})
export class UserListsComponent implements OnInit {
  users: User[];
 
  constructor(private userService: UserService, private router:Router){}

  ngOnInit(): void {
    this.getAllUsers();
    
  }

 getAllUsers(){
    this.userService.getAllUsers().subscribe(data =>{
      this.users= data; 
      //console.log(data[0].address);
    })   
 }

 userDetails(id:number){
  this.router.navigate(['user-details', id]);
 }

 upDateUser(id:number){
  this.router.navigate(['update-user', id]);
 }

 deleteUser(id:number){
  this.userService.deleteUser(id).subscribe(data => {
    return this.getAllUsers();
  })
 }

 

 }

