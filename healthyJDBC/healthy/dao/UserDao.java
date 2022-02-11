package com.healthyJDBC.healthy.dao;

import java.util.List;
import com.healthyJDBC.healthy.entity.Exercise;
import com.healthyJDBC.healthy.entity.User;
import com.healthyJDBC.healthy.entity.Workout;


public interface UserDao {

  User updateUser = null;
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
  /**
   * 
   * @param exercise
   * @return
   */

  Exercise createExercise(Exercise exercise);
  /**
   * 
   */
  
  Workout createWorkout(Workout workout);
  /**
   * 
   */
  
  User deleteUser(User user);
  /**
   * 
   */
  
  Exercise deleteExercise(Exercise exercise);
  /**
   * 
   */
  
  Workout deleteWorkout(Workout workout);
  /**
   * 
   */

  User postUser(User user);
  /**
   * 
   */
  
  Exercise postExercise(Exercise exercise);
  /**
   * 
   */
  
  Workout postWorkout(Workout workout);
  /**
   * 
   */

  User getUser(User user);
 
  
  

}
