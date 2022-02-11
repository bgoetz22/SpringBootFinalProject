package com.healthyJDBC.healthy.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.healthyJDBC.healthy.entity.Exercise;
import com.healthyJDBC.healthy.entity.User;
import com.healthyJDBC.healthy.service.UserService;

@RestController
public class HealthyUserController implements UserController{
//2/9 these methods are edited in healthyUserService cont to serv cont to serv
  @Autowired
  private UserService userService;
//  @Autowired
//  private ExerciseService exerciseService;
//  @Autowired
//  private WorkoutService workoutService;

  @Override
  public List <User> fetchUser() {
   
    return userService.fetchUser();
  }
  
  @Override
  public User createUser(@RequestBody User user) {
    return userService.createUser(user);
  }
// 2/10 make sure other variables put in like Exercsie category
//  @Override
//  public List<User> fetchExercise() {
//   
//    return null;
//  }
//
//  @Override
//  public List<User> fetchWorkout() {
//   
//    return null;
//  }
  
}
