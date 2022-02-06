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

import com.healthylifestyle.model.Gym;
import com.healthylifestyle.repository.GymRepository;

@RestController
public class GymController {
	 @Autowired
	 private GymRepository gymRepository;

	 //get all gyms
	 @GetMapping("/gyms")
	 public List<Gym> getGyms() {
		return gymRepository.findAll();
	 }
	 
	 //add gym
	 @PostMapping("/gym")
	 public Gym createGym(@RequestBody Gym gym) {
        return this.gymRepository.save(gym);
	 }
	 
	 //get user by id
	 @GetMapping("/gym/{id}")
	 public Optional<Gym> getGymById(@PathVariable(value = "id") int id) {
        return gymRepository.findById(id);
	 }
}
