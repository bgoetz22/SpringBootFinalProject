package com.healthyJDBC.healthy.entity;

import java.math.BigDecimal;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

  // app_user (name, email, height, weight, meals, exercises)
  
  private int ID;

  private String name;

  private String email;

  private BigDecimal height;

  private BigDecimal weight;

  // private List<Meal> meals; future implementation

  // private List<Workout> exercises;



}
