package com.promineotech.healthy.controller.support;

import static org.assertj.core.api.Assertions.assertThat;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import com.healthyJDBC.healthy.entity.User;

public class FetchHealthyTestSupport extends BaseTest { 
  protected List<User> buildExpected() {
    List<User> list = new LinkedList<>();
    
    // @formatter:off
//    list.add(User.builder()
//        .modelID(JeepModel.WRANGLER)
//        .trimLevel("Sport")
//        .numDoors(2)
//        .wheelSize(17)
//        .basePrice(new BigDecimal("28475.00"))
//        .build());
//    
//    list.add(User.builder()
//        .modelID(JeepModel.WRANGLER)
//        .trimLevel("Sport")
//        .numDoors(4)
//        .wheelSize(17)
//        .basePrice(new BigDecimal("31975.00"))
//        .build());
//    // @formatter:on
//    
//    Collections.sort(list);
    return list;
  }
  
  /**
   * 
   * @param error
   * @param status
   */
  
  protected void assertErrorMessageValid(Map<String, Object> error, HttpStatus status) {
    // @// @formatter:off
    assertThat(error)
      .containsKey("message")
      .containsEntry("status code", status.value())
      .containsEntry("uri", "/jeeps")
      .containsKey("timestamp")
      .containsEntry("reason", status.getReasonPhrase());
    // @formatter:on

    
  }

}
















































