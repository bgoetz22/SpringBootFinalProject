package com.healthyJDBC.healthy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.healthyJDBC.healthy.entity.Exercise;
import com.healthyJDBC.healthy.entity.User;
import com.healthyJDBC.healthy.entity.Workout;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.servers.Server;

  //Swagger Api initiation 2/8 BG goes here
  @Validated
  @RequestMapping("/users")
  @OpenAPIDefinition(info = @Info(title = "User Service"),
      servers = {@Server(url = "http://localhost:8080", description = "Local server.")})
  public interface UserController {

    // @formatter: off
    @Operation(
        summary = "Returns a list of Users",
        description = "Returns a list of Users",
        responses = {
            @ApiResponse(responseCode = "200", description = "A list of Users is returned",
                content = @Content(mediaType = "application/json",
                    schema = @Schema(implementation = User.class))),
            @ApiResponse(responseCode = "400", description = "The request parameters are invalid",
                content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "404",
                description = "No Users were found with the input criteria",
                content = @Content(mediaType = "application/json")),
            @ApiResponse(responseCode = "500", description = "An unplanned error occured",
                content = @Content(mediaType = "application/json"))


        }
       

    )
  
  @GetMapping
  @ResponseStatus(code = HttpStatus.OK)
   List <User> fetchUser();
    
    @PostMapping
    @ResponseStatus (code = HttpStatus.CREATED)
     User createUser(@RequestBody User user);
   
//    @Operation(
//        summary = "Returns a list of Exercises",
//        description = "Returns a list of Exercises",
//        responses = {
//            @ApiResponse(responseCode = "200", description = "A list of Exercises is returned",
//                content = @Content(mediaType = "application/json",
//                    schema = @Schema(implementation = Exercise.class))),
//            @ApiResponse(responseCode = "400", description = "The request parameters are invalid",
//                content = @Content(mediaType = "application/json")),
//            @ApiResponse(responseCode = "404",
//                description = "No Exercises were found with the input criteria",
//                content = @Content(mediaType = "application/json")),
//            @ApiResponse(responseCode = "500", description = "An unplanned error occured",
//                content = @Content(mediaType = "application/json"))
//
//
//        }
//       
//
//    )
  
//  @GetMapping
//  @ResponseStatus(code = HttpStatus.OK)
//   List <User> fetchExercise();
    
//    @Operation(
//        summary = "Returns a list of Workouts",
//        description = "Returns a list of Workouts",
//        responses = {
//            @ApiResponse(responseCode = "200", description = "A list of Workouts is returned",
//                content = @Content(mediaType = "application/json",
//                    schema = @Schema(implementation = Workout.class))),
//            @ApiResponse(responseCode = "400", description = "The request parameters are invalid",
//                content = @Content(mediaType = "application/json")),
//            @ApiResponse(responseCode = "404",
//                description = "No Workouts were found with the input criteria",
//                content = @Content(mediaType = "application/json")),
//            @ApiResponse(responseCode = "500", description = "An unplanned error occured",
//                content = @Content(mediaType = "application/json"))
//
//
//        }
//       
//
//    )
//  
//  @GetMapping
//  @ResponseStatus(code = HttpStatus.OK)
//   List <User> fetchWorkout();
//  


}
