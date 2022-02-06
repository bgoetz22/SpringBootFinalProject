package com.healthylifestyle.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healthylifestyle.model.Exercise;
import com.healthylifestyle.model.Gym;
import com.healthylifestyle.repository.ExerciseRepository;
import com.healthylifestyle.repository.GymRepository;

@RestController
public class ExerciseController {
	 @Autowired
	 private ExerciseRepository exerRepository;
	 
	 @Autowired
	 private GymRepository gymRepository;

	 //get all users
	 @GetMapping("/exercises")
	 public List<Exercise> getExercises() {
		return exerRepository.findAll();
	 }
	 
	 //add exercise without lib in endpoint
	 @PostMapping("/exercise")
	 public Exercise createExercise(@RequestBody Exercise exer) {
		 Optional<Gym> gym = gymRepository.findById(exer.getGym().getId());
		 exer.setGym(gym.get());
		 return this.exerRepository.save(exer);
	 }
	 
	 //add exercise by gym id
	 @PostMapping("/gym/{id}/exercise")
	 public Exercise createExerciseByGymId(@PathVariable(value = "id") int id, @RequestBody Exercise exer) {
		 Optional<Gym> gym = gymRepository.findById(id);
		 exer.setGym(gym.get());
		 return this.exerRepository.save(exer);
	 }
	 
	 //get exercise by id
	 @GetMapping("/exercise/{id}")
	 public Optional<Exercise> getExerById(@PathVariable(value = "id") int id) {
       return exerRepository.findById(id);
	 }
	 
	 //get all exercises by gym id
	 @GetMapping("/gym/{id}/exercises")
	 public List<Exercise> getAllExerByGymId(@PathVariable(value = "id") int gymid) {
       return exerRepository.findByGymId(gymid);
	 }
	 
	 // update user
	 @PutMapping("/exercise/{id}")
	 public Exercise updateExercise(@RequestBody Exercise exer) {
       return this.exerRepository.save(exer);
	 }
	 
	 // delete user by id
	 @DeleteMapping("/exercise/{id}")
	 public void deleteUser(@PathVariable(value = "id") int id) {
		 exerRepository.deleteById(id);
	 }
}
