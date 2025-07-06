package com.hei.student.endpoint.rest.controller.health;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import com.hei.student.services.StoredIntService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StoredIntController {
  @Autowired
  private final StoredIntService serviceStoredInt;


  @GetMapping("/stored-int")
  public int getStoredInt(){
    return serviceStoredInt.getLocalStoredInt();
  }

  @GetMapping("/stored-int-2")
  public int getStoredIntPath(){
    return serviceStoredInt.getStoredInt();
  }
}
