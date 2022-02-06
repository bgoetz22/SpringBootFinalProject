package com.healthylifestyle.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.healthylifestyle.model.AppUser;
import com.healthylifestyle.repository.AppUserRepository;

@RestController
public class AppUserController {
	
	 @Autowired
	 private AppUserRepository userRepository;
	 
	 //get all users
	 @GetMapping("/users")
	 public List<AppUser> getUsers() {
		return userRepository.findAll();
	 }
	 
	 //add user
	 @PostMapping("/user")
	 public AppUser createUser(@RequestBody AppUser user) {
        return this.userRepository.save(user);
	 }
	 
	 //get user by id
	 @GetMapping("/user/{id}")
	 public Optional<AppUser> getUserById(@PathVariable(value = "id") int userId) {
        return userRepository.findById(userId);
	 }
	 
	 // update user
	 @PutMapping("/user/{id}")
	 public AppUser updateUser(@RequestBody AppUser user) {
        return this.userRepository.save(user);
	 }
	 
	 // delete user by id
	 @DeleteMapping("/user/{id}")
	 public void deleteUser(@PathVariable(value = "id") int userId) {
		 userRepository.deleteById(userId);
	 }
    
	 //test localhost connection
	 @RequestMapping(method = RequestMethod.GET, value = "/hello", produces = "application/json")
	 public ResponseEntity<String> hello() {
        System.out.println("Hit me!");
        return new ResponseEntity<String>("Hello, you!", HttpStatus.OK);
	 }
}
