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
import com.healthylifestyle.model.Workout;
import com.healthylifestyle.repository.ExerciseRepository;
import com.healthylifestyle.repository.WorkoutRepository;

@RestController
public class WorkoutController {
	 @Autowired
	 private WorkoutRepository workoutRepository;
	 
	 //get all users
	 @GetMapping("/workouts")
	 public List<Workout> getWorkouts() {
		return workoutRepository.findAll();
	 }
	 
	 //add exercise
	 @PostMapping("/workout")
	 public Workout createExercise(@RequestBody Workout workout) {
		 return this.workoutRepository.save(workout);
	 }
	 
	 //get user by id
	 @GetMapping("/workout/{id}")
	 public Optional<Workout> getExerById(@PathVariable(value = "id") int id) {
       return workoutRepository.findById(id);
	 }
	 
	 // update user
	 @PutMapping("/workout/{id}")
	 public Workout updateWorkout(@RequestBody Workout workout) {
       return this.workoutRepository.save(workout);
	 }
	 
	 // delete user by id
	 @DeleteMapping("/workout/{id}")
	 public void deleteUser(@PathVariable(value = "id") int id) {
		 workoutRepository.deleteById(id);
	 }
}
