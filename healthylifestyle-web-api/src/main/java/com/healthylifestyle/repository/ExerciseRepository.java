package com.healthylifestyle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.healthylifestyle.model.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise, Integer>{
	List<Exercise> findByGymId(int gymId);
}
