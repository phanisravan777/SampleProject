package com.business.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class OrdersTest {

    @Test
    public void testSetAndGetOId() {
        Orders order = new Orders();
        order.setoId(1);
        assertEquals(1, order.getoId());
    }

    @Test
    public void testSetAndGetOName() {
        Orders order = new Orders();
        order.setoName("Test Order");
        assertEquals("Test Order", order.getoName());
    }

    @Test
    public void testSetAndGetOPrice() {
        Orders order = new Orders();
        order.setoPrice(100.0);
        assertEquals(100.0, order.getoPrice());
    }

    @Test
    public void testSetAndGetOQuantity() {
        Orders order = new Orders();
        order.setoQuantity(10);
        assertEquals(10, order.getoQuantity());
    }

    @Test
    public void testSetAndGetOrderDate() {
        Orders order = new Orders();
        Date date = new Date();
        order.setOrderDate(date);
        assertEquals(date, order.getOrderDate());
    }

    @Test
    public void testSetAndGetTotalAmount() {
        Orders order = new Orders();
        order.setTotalAmmout(1000.0);
        assertEquals(1000.0, order.getTotalAmmout());
    }

    @Test
    public void testSetAndGetUser() {
        Orders order = new Orders();
        User user = new User();
        order.setUser(user);
        assertEquals(user, order.getUser());
    }

    @Test
    public void testToString() {
        Orders order = new Orders();
        String expected = "Orders [oId=" + order.getoId() + ", oName=" + order.getoName() + ", oPrice=" + order.getoPrice() + ", oQuantity=" + order.getoQuantity()
                + ", orderDate=" + order.getOrderDate() + ", totalAmmout=" + order.getTotalAmmout() + ", user=" + order.getUser() + "]";
        assertEquals(expected, order.toString());
    }
}