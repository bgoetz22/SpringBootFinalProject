package com.healthyJDBC.healthy.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.healthyJDBC.healthy.dao.HealthyUserDao;
import com.healthyJDBC.healthy.dao.UserDao;
import com.healthyJDBC.healthy.entity.Exercise;
import com.healthyJDBC.healthy.entity.User;
import com.healthyJDBC.healthy.entity.Workout;

@Service
public class HealthyUserService implements UserService{
  @Autowired
  private UserDao userDao;
  @Override
  public List<User> fetchUser() {
    // TODO Auto-generated method stub
    return userDao.fetchUser();
  }

  @Override
  public List<Exercise> fetchExercise() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Workout> fetchWorkout() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public User createUser(User user) {
    // TODO Auto-generated method stub
    return userDao.createUser(user);
  }

  
}
