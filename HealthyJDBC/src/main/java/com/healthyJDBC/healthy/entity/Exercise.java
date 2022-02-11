package com.healthyJDBC.healthy.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Exercise {
  
  private int ID;
  
  private String name;
   
  private String muscleGroup;
    
 

}
