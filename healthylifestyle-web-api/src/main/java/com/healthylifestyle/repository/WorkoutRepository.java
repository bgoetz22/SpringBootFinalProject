package com.healthylifestyle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthylifestyle.model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Integer>{

}
