package com.healthyJDBC.healthy.entity;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Workout {
  
  private int ID;
  
  private int appUserId;
  
  private int sets;
  
  private int reps;
  
  private String dateCompleted;
    
  

}
