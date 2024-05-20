package com.business.entities.test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.business.entities.Orders;
import com.business.entities.User;

public class UserTest {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
    }

    @Test
    public void testGetU_id() {
        user.setU_id(1);
        assertEquals(1, user.getU_id());
    }

    @Test
    public void testGetUname() {
        user.setUname("Test User");
        assertEquals("Test User", user.getUname());
    }

    @Test
    public void testGetUemail() {
        user.setUemail("testuser@example.com");
        assertEquals("testuser@example.com", user.getUemail());
    }

    @Test
    public void testGetUpassword() {
        user.setUpassword("password123");
        assertEquals("password123", user.getUpassword());
    }

    @Test
    public void testGetUnumber() {
        user.setUnumber(1234567890L);
        assertEquals(1234567890L, user.getUnumber());
    }

    @Test
    public void testGetOrders() {
        List<Orders> orders = new ArrayList<>();
        user.setOrders(orders);
        assertEquals(orders, user.getOrders());
    }

    @Test
    public void testToString() {
        assertNotNull(user.toString());
    }
}