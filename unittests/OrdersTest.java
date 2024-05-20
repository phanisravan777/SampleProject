package com.business.entities.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.business.entities.Orders;
import com.business.entities.User;

public class OrdersTest {

    private Orders orders;
    private User user;

    @BeforeEach
    public void setUp() {
        orders = new Orders();
        user = new User();
    }

    @Test
    public void testSetAndGetOrderId() {
        int id = 1;
        orders.setoId(id);
        assertEquals(id, orders.getoId());
    }

    @Test
    public void testSetAndGetOrderName() {
        String name = "Test Order";
        orders.setoName(name);
        assertEquals(name, orders.getoName());
    }

    @Test
    public void testSetAndGetOrderPrice() {
        double price = 100.0;
        orders.setoPrice(price);
        assertEquals(price, orders.getoPrice());
    }

    @Test
    public void testSetAndGetOrderQuantity() {
        int quantity = 10;
        orders.setoQuantity(quantity);
        assertEquals(quantity, orders.getoQuantity());
    }

    @Test
    public void testSetAndGetOrderDate() {
        Date date = new Date();
        orders.setOrderDate(date);
        assertEquals(date, orders.getOrderDate());
    }

    @Test
    public void testSetAndGetTotalAmount() {
        double totalAmount = 1000.0;
        orders.setTotalAmmout(totalAmount);
        assertEquals(totalAmount, orders.getTotalAmmout());
    }

    @Test
    public void testSetAndGetUser() {
        orders.setUser(user);
        assertEquals(user, orders.getUser());
    }

    @Test
    public void testToString() {
        assertNotNull(orders.toString());
    }
}