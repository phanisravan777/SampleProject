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
    public void testOrderController() {
        // Add your test cases here
        // Example: Assert that orderController is not null
        // assertNotNull(orderController);
    }
}