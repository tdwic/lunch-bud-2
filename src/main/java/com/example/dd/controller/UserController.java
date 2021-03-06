package com.example.dd.controller;

import com.example.dd.entity.Restaurant;
import com.example.dd.entity.User;
import com.example.dd.models.UserModel;
import com.example.dd.models.UserValidationModel;
import com.example.dd.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/newUser", method = RequestMethod.POST)
    public UserModel RegisterNewUser(@RequestBody UserModel user){
        return userService.RegisterNeUser(user);
    }

    @RequestMapping(value = "/isValidUser", method = RequestMethod.POST)
    public boolean RegisterNewUser(@RequestBody UserValidationModel validationModel){
        return userService.IsValidUser(validationModel);
    }

    @RequestMapping(value = "/userByUserId/{userID}", method = RequestMethod.GET)
    public Optional<User> GetUserDetailsByUserID(@PathVariable  String userID){
        return userService.GetUserDetailsByUserID(userID);
    }

    @RequestMapping(value = "/userByUserName/{userName}", method = RequestMethod.GET)
    public Optional<User> GetUserDetailsByUserName(@PathVariable  String userName){
        return userService.GetUserDetailsByUserName(userName);
    }

    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List<User> GetAllUser(){
        return userService.GetAllUsers();
    }
}
