package com.healthylifestyle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthylifestyle.model.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Integer>{

}
