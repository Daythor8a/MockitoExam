package com.ibm.exam;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class JunitMockitoExamApplicationTests {

  @Autowired
  private ApplicationContext context;
  
    @Test
    void contextLoads() {
        //log.info("Testing business analysis context");
        JunitMockitoExamApplication.main(new String[] {});
        assertNotNull(context);
    }
}
