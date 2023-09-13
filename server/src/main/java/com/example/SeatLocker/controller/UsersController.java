package com.example.SeatLocker.controller;

import com.example.SeatLocker.entities.Users;
import com.example.SeatLocker.entities.enums.UserType;
import com.example.SeatLocker.services.UsersServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "users/")
public class UsersController {

	private final UsersServices usersServices;

	UsersController(UsersServices usersServices){
		this.usersServices = usersServices;
	}

	@GetMapping(path = "users")
	public List<Users> getUsers() {
		return usersServices.getUsers();
	}

	@PostMapping(path = "/register")
	public void register(Users user) {
		user.setUserType(UserType.CUSTOMER);
		usersServices.addUser(user);
	}
	
	@PostMapping(path = "/login")
	public void login() {
		
	}
	
	@PostMapping(path = "/logout")
	public void logout() {
		
	}
	
	@PostMapping(path = "/resetPassword")
	public void  resetPassword() {
		
	}
	
	
}
