import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  baseUrl = "http://localhost:8200/";
  apiUrl = this.baseUrl + "application/api/v1/users"

  constructor(private http: HttpClient) { }

  //get list from user
  getAllUsers(): Observable<User[]>{
    return this.http.get<User[]>(`${this.apiUrl}`)
  }

  //creating user service and adding it to the user
  createUser(user:User): Observable<Object>{
  return this.http.post(`${this.apiUrl}`, user);
  }

  getUserById(id:number): Observable<User>{
    return this.http.get<User>(`${this.apiUrl}/${id}`)
  }

  updateUser(id:number, user:User): Observable<User>{
    return this.http.put<User>(`${this.apiUrl}/${id}`, user);
  }

  deleteUser(id:number): Observable<User> {
    return this.http.delete<User>(`${this.apiUrl}/${id}`);
  }
}
