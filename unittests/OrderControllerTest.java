package com.business.controllers.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.business.controllers.OrderController;

@SpringBootTest
public class OrderControllerTest {

@Autowired
private OrderController orderController;

@Test
public void contextLoads() {
// Test case to check if the OrderController is loaded into the Spring context
assertNotNull(orderController);
}

// Add more test cases here to cover all methods in OrderController

}