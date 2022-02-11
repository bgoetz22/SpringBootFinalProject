package com.healthyJDBC.healthy.dao;

import java.util.List;
import com.healthyJDBC.healthy.entity.Exercise;
import com.healthyJDBC.healthy.entity.User;
import com.healthyJDBC.healthy.entity.Workout;


public interface UserDao {

  List<User> fetchUser();

  /**
   * 
   */
  List<Exercise> fetchExercise();

  /**
   * 
   */
  List<Workout> fetchWorkout();
  
  /**
   * 
   */
  User createUser(User user);
  

}
