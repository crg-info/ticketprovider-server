package com.crg.redbus.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.crg.redbus.businfo.model.ApiResponse;
import com.crg.redbus.user.model.User;
import com.crg.redbus.user.model.UserDto;
import com.crg.redbus.user.service.UserService;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ApiResponse<User> saveUser(@RequestBody UserDto user){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",userService.save(user));
    }

    @GetMapping
    public ApiResponse<List<User>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",userService.findAll());
    }
    @GetMapping("/searchUserById/{salary}")
    public ApiResponse<User> searchUserById(@PathVariable int salary){
        return new ApiResponse<>(HttpStatus.OK.value(), "User Details fetched successfully.",userService.findBySalary(salary));
    }

    @GetMapping("/{id}")
    public ApiResponse<User> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",userService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<UserDto> update(@RequestBody UserDto userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",userService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        userService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.", null);
    }

 

}
