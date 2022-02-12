package com.healthyJDBC.healthy.dao;

import java.util.List;
import java.util.Optional;
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
  List<Workout> fetchWorkout(int appUserId, int sets, int reps, String dateCompleted);
  
  /**
   * 
   */
  Optional<User> createUser(String name, String email, int height, int weight);
  /**
   * 
   * @param exercise
   * @return
   */

  Optional<Exercise> createExercise(Exercise exercise);
  /**
   * 
   */
  
  Optional<Workout> createWorkout(Workout workout);
  /**
   * 
   */
  
  Optional<User> deleteUser(User user);
  /**
   * 
   */
  
  Optional<Exercise> deleteExercise(Exercise exercise);
  /**
   * 
   */
  
  Optional<Workout> deleteWorkout(Workout workout);
  /**
   * 
   */

  Optional<User> postUser(User user);
  /**
   * 
   */
  
  Optional<Exercise> postExercise(Exercise exercise);
  /**
   * 
   */
  
  Optional<Workout> postWorkout(Workout workout);
  /**
   * 
   *
  
*   * 
   * @return
   */
  
  Optional<User> updateUser();

  Optional<Exercise> createExercise(String name, String muscleGroup);

  Optional<Workout> createWorkout(int sets, int reps, String dateCompleted);

  Optional<User> deleteUser(String name, String email, int height, int weight);

  Optional<Workout> deleteWorkout(int sets, int reps, String dateCompleted);

  Optional<Exercise> deleteExercise(String name, String muscleGroup);

  User createUser(User user);

  List<Workout> fetchWorkout();
 
  
  

}
