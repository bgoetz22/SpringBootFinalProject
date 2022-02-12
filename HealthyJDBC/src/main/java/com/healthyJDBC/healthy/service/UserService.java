package com.healthyJDBC.healthy.service;

import java.util.List;
import com.healthyJDBC.healthy.entity.Exercise;
import com.healthyJDBC.healthy.entity.User;
import com.healthyJDBC.healthy.entity.Workout;

public interface UserService {

  List<User> fetchUser();
  
  List<Exercise> fetchExercise();
  
  List<Workout> fetchWorkout();

  User deleteUser(User user);
  
  User createUser(User user);
  
  User updateUser(User user);

  User postUser(User user);

  User getUser(User user);
  


}
