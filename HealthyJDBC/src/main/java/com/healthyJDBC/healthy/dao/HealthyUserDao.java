package com.healthyJDBC.healthy.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import com.healthyJDBC.healthy.entity.Exercise;
import com.healthyJDBC.healthy.entity.User;
import com.healthyJDBC.healthy.entity.Workout;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HealthyUserDao implements UserDao {
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;

  /**
   * 2/11 Stephanie and Jolene, Lisa
   */
  // @Override
  // public Order saveOrder(user user, Jeep jeep, Color color,
  // Engine engine, Tire tire, BigDecimal price, List<Option> options) {
  // SqlParams params =
  // generateInsertSql(user, jeep, color, engine, tire, price);
  //
  // KeyHolder keyHolder = new GeneratedKeyHolder();
  // jdbcTemplate.update(params.sql, params.source, keyHolder);
  //
  // Long orderPK = keyHolder.getKey().longValue();
  // saveOptions(options, orderPK);
  //
//    // @formatter:off
//    return Order.builder()
//        .orderPK(orderPK)
//        .user(user)
//        .model(jeep)
//        .color(color)
//        .engine(engine)
//        .tire(tire)
//        .options(options)
//        .price(price)
//        .build();
//    // @formatter:on
  // }

  /**
   * 
   */
  // private void saveOptions(List<Option> options, Long orderPK ) {
  // for(Option option : options) {
  // SqlParams params = generateInsertSql(option, orderPK);
  // jdbcTemplate.update(params.sql, params.source);
  // }
  // }
  //
  // private SqlParams generateInsertSql(Option option, Long orderPK) {
  // SqlParams params = new SqlParams();
  //
//    // @formatter:off
//    params.sql = ""
//        +   "INSERT INTO order_options ("
//        +   "option_fk, order_fk"
//        +   ") VALUES ("
//        +   ":option_fk, :order_fk"
//        +   ")";
//    // @formatter:on
  //
  // params.source.addValue("option_fk", option.getOptionPK());
  // params.source.addValue("order_fk", orderPK);
  //
  // return params;
  // }

  /**
   * 
   * @param user
   * @param jeep
   * @param color
   * @param engine
   * @param tire
   * @param price
   * @return
   */
  // private SqlParams generateInsertSql(user user, Jeep jeep, Color color, Engine engine,
  // Tire tire, BigDecimal price) {
//    // @formatter:off
//    String sql = ""
//        +   "INSERT INTO orders ("
//        +   "user_fk, color_fk, engine_fk, tire_fk, model_fk, price"
//        +   ") VALUES ("
//        +   ":user_fk, :color_fk, :engine_fk, :tire_fk, :model_fk, :price"
//        +   ")"; 
//    // @formatter:on
  //
  // SqlParams params = new SqlParams();
  //
  // params.sql = sql;
  // params.source.addValue("user_fk", user.getuserPK());
  // params.source.addValue("color_fk", color.getColorPK());
  // params.source.addValue("engine_fk", engine.getEnginePK());
  // params.source.addValue("tire_fk", tire.getTirePK());
  // params.source.addValue("model_fk", jeep.getModelPK());
  // params.source.addValue("price", price);
  //
  // return params;
  //
  //
  //
  // }

  // @Override
  // public List<Option> fetchOptions(List<String> optionIds) {
  // if(optionIds.isEmpty()) {
  // return new LinkedList<>();
  // }
  //
  // Map<String, Object> params = new HashMap<>();
  //
//      //  @formatter:off
//    String sql = ""
//        +   "SELECT * "
//        +   "FROM options "
//        +   "WHERE option_id IN(";
//    // @formatter:on
  //
  // for(int index = 0; index < optionIds.size(); index++) {
  // String key = "option_" + index;
  // sql += ":" + key + ", ";
  // params.put(key, optionIds.get(index));
  // }
  //
  // sql = sql.substring(0, sql.length() - 2);
  // sql += ")";
  //
  // return jdbcTemplate.query(sql, params, new RowMapper<Option>() {
  // @Override
  // public Option mapRow(ResultSet rs, int rowNum) throws SQLException {
//        // @formatter:off
//        return Option.builder()
//            .category(OptionType.valueOf(rs.getString("category")))
//            .manufacturer(rs.getString("manufacturer"))
//            .name(rs.getString("name"))
//            .optionId(rs.getString("option_id"))
//            .optionPK(rs.getLong("option_pk"))
//            .price(rs.getBigDecimal("price"))
//            .build();
//         // @formatter:on     
  // }
  // });
  // }

  /**
   * 
   */ // 2/8
  @Override
  public List<Exercise> fetchExercise() {
 // @formatter:off
    String sql = ""
        +   "SELECT * "
        +   "FROM Exercise ";
       // +   "WHERE ID = ID";
 // @formatter:on
    return jdbcTemplate.query(sql, new RowMapper<Exercise>() {
      @Override
      public Exercise mapRow(ResultSet rs, int rowNum) throws SQLException {
      // @formatter:off
      return Exercise.builder()
          .ID(rs.getInt("ID"))
          .name(rs.getString("name"))
          .muscleGroup(rs.getString("muscle_group"))
          .build();
       // @formatter:on     
      }
    });
  }


  /**
   *
   */ // 2/8
  @Override
  public List<User> fetchUser() {
    //@formatter:off
      String sql = ""
          +   "SELECT * "
          +   "FROM app_user ";
         // +   "WHERE ID = :ID ";
   // @formatter:off
      return jdbcTemplate.query(sql, new RowMapper<User>()   {
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
          return User.builder()
              .ID(rs.getInt("ID"))
              .name(rs.getString("name"))
              .email(rs.getString("email"))
              .height(rs.getBigDecimal("height"))
              .weight(rs.getBigDecimal("weight"))
              .build();
           // @formatter:on    

      }
    });
  }

  /**
   * 
   */ // 2/8
  @Override
  public List<Workout> fetchWorkout(int appUserId, int sets, int reps, String dateCompleted) {
    // @formatter:off
      String sql = ""
          + "SELECT * "
          + "FROM Workout ";
        //  + "WHERE ID = :ID"
   // @formatter:off
      return jdbcTemplate.query(sql, new RowMapper<Workout>()   {
        public Workout mapRow(ResultSet rs, int rowNum) throws SQLException {
          return Workout.builder()
              .ID(rs.getInt("ID"))
              .appUserId(rs.getInt("app_user_id"))
              .sets(rs.getInt("sets_qty"))
              .reps(rs.getInt("reps_qty"))
              .dateCompleted(rs.getString("date_completed"))
              .build();
           // @formatter:on    
      }
    });
  }

  /**
   * 
   * 
   * @author borisgoetz
   * 
   */



  class UserResultSetExtractor implements ResultSetExtractor<User> {
    @Override
    public User extractData(ResultSet rs) throws SQLException, DataAccessException {
      rs.next();

      // @formatter:off  //app_user 2/8 user, exercise , workout
      return User.builder()
          .ID(rs.getInt("ID"))
          .name(rs.getString("name"))
          .email(rs.getString("email"))
          .height(rs.getBigDecimal("height"))
          .weight(rs.getBigDecimal("weight"))
          .build();
      // @formatter:on
    }

  }
  // app_user 2/8 user, exercise , workout
  class ExerciseResultSetExtractor implements ResultSetExtractor<Exercise> {
    @Override
    public Exercise extractData(ResultSet rs) throws SQLException {
      rs.next();

      // @formatter:off
        return Exercise.builder()
            .ID(rs.getInt("ID"))
            .name(rs.getString("name"))
            .muscleGroup(rs.getString("muscle_group"))
            .build();
        // @formatter:on
    }
  }

  // app_user 2/8 user, exercise , workout
  class WorkoutResultSetExtractor implements ResultSetExtractor<Workout> {
    @Override
    public Workout extractData(ResultSet rs) throws SQLException {
      rs.next();

      // @formatter:off
        return Workout.builder()
            .ID(rs.getInt("ID"))
            .appUserId(rs.getInt("app_user_id"))
            .sets(rs.getInt("sets_qty"))
            .reps(rs.getInt("reps_qty"))
            .dateCompleted(rs.getString("date_completed"))
            .build();
        // @formatter:on
    }
  }



  // @Override
  // public java.util.Optional<user> fetchuser(String userId) {
  // // TODO Auto-generated method stub
  // return null;
  // }
  //
  // @Override
  // public java.util.Optional<Jeep> fetchModel(JeepModel model, String trim, int doors) {
  // // TODO Auto-generated method stub
  // return null;
  // }
  //
  // @Override
  // public java.util.Optional<Color> fetchColor(String colorId) {
  // // TODO Auto-generated method stub
  // return null;
  // }
  //
  // @Override
  // public java.util.Optional<Engine> fetchEngine(String engineId) {
  // // TODO Auto-generated method stub
  // return null;
  // }
  //
  // @Override
  // public java.util.Optional<Tire> fetchTire(String tireId) {
  // // TODO Auto-generated method stub
  // return null;
  // }



  class SqlParams {
    String sql;
    MapSqlParameterSource source = new MapSqlParameterSource();
  }


  //2/11 Stephanie: did this together below 344-359
  @Override
  public Optional<User> createUser(String name, String email, int height, int weight) {
    log.info("DAO: name={}, email={}, height={}, weight={}", name, email, height, weight);
    
    String sql = "INSERT into app_user (name, email, height, weight) values(:name, :email, :height, :weight)";
    Map<String, Object> params = new HashMap<>();
//    KeyHolder holder = new GeneratedKeyHolder();
//    MapSqlParameterSource params = new MapSqlParameterSource();
    params.put("name", name.toString());
    params.put("email", email.toString());
    params.put("height", height.toBigDecimal());//convert integer to String
    params.put("weight", weight.toString());
    
    jdbcTemplate.update(sql, params);
    return Optional.ofNullable(User.builder().name(name).email(email).height(height).weight(weight));
        }
  

//  @Override
//  public Optional<Pie> createPies(String pieID, PieSize pieSize, PieType pieType) {
//    log.info("DAO: pieID={}, pieSize={}", pieID, pieSize);
  
  
  // 2/10 
  @Override
  public Optional<Exercise> createExercise(String name, String muscleGroup) {
    log.info("DAO: name={}, muscle_group={}", name, muscleGroup);
    
    String sql = "INSERT into exercise (name, muscle_group) values(:name, :muscle_group)";
    Map<String, Object> params = new HashMap<>();
//    KeyHolder holder = new GeneratedKeyHolder();
//    MapSqlParameterSource params = new MapSqlParameterSource();
    params.put("name", name.toString());
    params.put("muscle_group", muscleGroup.toString());
    
    jdbcTemplate.update(sql, params);
    return Optional.ofNullable(User.builder().name(name).muscleGroup(muscleGroup));
  }
  
  // 2/10
  @Override
  public Optional<Workout> createWorkout(int sets, int reps, String dateCompleted) {
    log.info("DAO: sets_qty={}, reps_qty={}, date_completed={}", sets, reps, dateCompleted);
    
    String sql = "INSERT into workout (sets_qty, resp_qty, date_completed) values(:sets_qty, :reps_qty, :date_completed)";
    Map<String, Object> params = new HashMap<>();
//    KeyHolder holder = new GeneratedKeyHolder();  
//    MapSqlParameterSource params = new MapSqlParameterSource();
    params.put("sets_qty", sets.bigInt());
    params.put("reps_qty", reps.bigInt());
    params.put("date_completed", dateCompleted.toString());
    
    jdbcTemplate.update(sql, params);
    return Optional.ofNullable(User.builder().sets(sets).reps(reps).dateCompleted(dateCompleted));
  }

  //-----------------ALL 2/10 updated at 7:47 PM below-------------------
  @Override
  public Optional<User> deleteUser(String name, String email, int height, int weight) {
    log.info("DAO: name={}, email={}, height={}, weight={}", name, email, height, weight);
    
    String sql = "DELETE from app_user (name, email, height, weight) values(:name, :email, :height, :weight)";
    Map<String, Object> params = new HashMap<>();
//    KeyHolder holder = new GeneratedKeyHolder();
//    MapSqlParameterSource params = new MapSqlParameterSource();
    params.put("name", name.toString());
    params.put("email", email.toString());
    params.put("height", height.toBigDecimal());//convert integer to String
    params.put("weight", weight.toString());
    
    jdbcTemplate.update(sql, params);
    return Optional.ofNullable(User.builder().name(name).email(email).height(height).weight(weight));
  }

    @Override
    public Optional<Exercise> deleteExercise(String name, String muscleGroup) {
      log.info("DAO: name={}, muscle_group={}", name, muscleGroup);
      
      String sql = "DELETE from exercise (name, muscle_group) values(:name, :muscle_group)";
      Map<String, Object> params = new HashMap<>();
//      KeyHolder holder = new GeneratedKeyHolder();
//      MapSqlParameterSource params = new MapSqlParameterSource();
      params.put("name", name.toString());
      params.put("muscle_group", muscleGroup.toString());
      
      jdbcTemplate.update(sql, params);
      return Optional.ofNullable(User.builder().name(name).muscleGroup(muscleGroup));
    
  }


  @Override
    public Optional<Workout> deleteWorkout(int sets, int reps, String dateCompleted) {
      log.info("DAO: sets_qty={}, reps_qty={}, date_completed={}", sets, reps, dateCompleted);
      
      String sql = "DELETE into workout (sets_qty, resp_qty, date_completed) values(:sets_qty, :reps_qty, :date_completed)";
      Map<String, Object> params = new HashMap<>();
//      KeyHolder holder = new GeneratedKeyHolder();  
//      MapSqlParameterSource params = new MapSqlParameterSource();
      params.put("sets_qty", sets.bigInt());
      params.put("reps_qty", reps.bigInt());
      params.put("date_completed", dateCompleted.toString());
      
      jdbcTemplate.update(sql, params);
      return Optional.ofNullable(User.builder().sets(sets).reps(reps).dateCompleted(dateCompleted));
      
  }


//  @Override
//  public Optional<User> postUser(User user) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<Exercise> postExercise(Exercise exercise) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<Workout> postWorkout(Workout workout) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public List<User> getUser(User user) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<User> createUser(User user) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<Exercise> createExercise(Exercise exercise) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<Workout> createWorkout(Workout workout) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<User> deleteUser(User user) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<Exercise> deleteExercise(Exercise exercise) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<Workout> deleteWorkout(Workout workout) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<User> postUser(User user) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<Exercise> postExercise(Exercise exercise) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<Workout> postWorkout(Workout workout) {
//    // TODO Auto-generated method stub
//    return null;
//  }
//
//
//  @Override
//  public Optional<User> updateUser() {
//    // TODO Auto-generated method stub
//    return null;
//  }
  

}
 




