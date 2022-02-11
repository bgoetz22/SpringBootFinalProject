package com.healthyJDBC.healthy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.healthyJDBC.ComponentScanMarker;

@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class })
public class healthyJDBCmain {

  public static void main(String[] args) {

    SpringApplication.run(healthyJDBCmain.class, args);

  }

}































