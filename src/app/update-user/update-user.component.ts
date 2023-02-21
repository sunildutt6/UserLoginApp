import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service'


@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {
  user:User = new User();
  id:number;
  constructor(private userService: UserService, private route:ActivatedRoute, private router:Router){}

  onSubmit(){
    this.updateUser();
  }
  
  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.userService.getUserById(this.id).subscribe({
      next:(data)=>this.user = data,
      error:(error)=>console.log(error),
    });
  }

  updateUser(){
    this.userService.updateUser(this.id, this.user).subscribe({
      next:() =>  this.gotoUserList(),
      error:(error) => console.log(error)
    })
  }

   gotoUserList(){
     this.router.navigate(['/users']);
   }

  
 
}
