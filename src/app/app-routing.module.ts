import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateUserComponent } from './create-user/create-user.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { UserDetailsComponent } from './user-details/user-details.component';
import { UserListsComponent } from './user-lists/user-lists.component';

const routes: Routes = [
  {path:'users', component:UserListsComponent},
  {path:'create-user', component:CreateUserComponent},
  {path:'users/:id',component:UserDetailsComponent},
  {path:'update-user/:id', component:UpdateUserComponent},
  {path:'user-details/:id', component:UserDetailsComponent},
  {path:'', redirectTo:'create-user', pathMatch:'full'},
  {path:'**', component:PageNotFoundComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
