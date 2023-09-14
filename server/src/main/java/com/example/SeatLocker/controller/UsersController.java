package com.example.SeatLocker.controller;

import com.example.SeatLocker.entities.Users;
import com.example.SeatLocker.entities.enums.UserType;
import com.example.SeatLocker.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "users")
public class UsersController {

    private final UsersServices usersServices;

    @Autowired
    public UsersController(UsersServices usersServices) {
        this.usersServices = usersServices;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<Users>> getUsers() {
        return new ResponseEntity<>(usersServices.getUsers(), HttpStatus.OK);
    }

    @PostMapping(path = "/register")
    public ResponseEntity<String> register(@RequestBody Users user) {
        user.setUserType(UserType.CUSTOMER);
        try{
            usersServices.addUser(user);
        } catch (Exception e){
            return new ResponseEntity<>("Username or email already exists.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("User registered successfully.", HttpStatus.CREATED);
    }

    @PostMapping(path = "/login")
    public void login() {

    }

    @PostMapping(path = "/logout")
    public void logout() {

    }

    @PostMapping(path = "/resetPassword")
    public void resetPassword() {

    }

    @PutMapping(path = "/update/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable("userId") Long Id, @RequestBody Users updatedUserData) {
        System.out.println("updating");
        try{
            usersServices.updateUser(Id, updatedUserData);
        } catch (Exception e){
            System.out.println(e);
            return new ResponseEntity<>("Username or email already exists.", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("User updated successfully.", HttpStatus.OK);

    }


}
