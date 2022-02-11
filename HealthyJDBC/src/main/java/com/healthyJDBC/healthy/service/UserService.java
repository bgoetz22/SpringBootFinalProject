package com.healthyJDBC.healthy.service;

import java.util.List;
import com.healthyJDBC.healthy.entity.Exercise;
import com.healthyJDBC.healthy.entity.User;
import com.healthyJDBC.healthy.entity.Workout;

public interface UserService {

  List<User> fetchUser();
  
  User createUser(User user);
  
  List<Exercise> fetchExercise();
  
  List<Workout> fetchWorkout();

}
