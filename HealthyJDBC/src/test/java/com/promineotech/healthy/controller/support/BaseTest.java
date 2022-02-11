package com.promineotech.healthy.controller.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import lombok.Getter;

abstract class BaseTest {
  @LocalServerPort
  private int serverPort;

  @Autowired
  @Getter
  private TestRestTemplate restTemplate;
  
  /**
   * 
   * @return
   */

  protected String getBaseUriForJeeps() {
    return String.format("http://localhost:%d/jeeps", serverPort);
  }
  
  /**
   * 
   * @return
   */

  protected String getBaseUriForOrders() {
    return String.format("http://localhost:%d/orders", serverPort);
  }

}