package com.healthylifestyle.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthylifestyle.model.Gym;

public interface GymRepository extends JpaRepository<Gym, Integer>{

}
