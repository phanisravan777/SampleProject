package com.business.entities;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;

public class UserTest {

    @Test
    public void testGetU_id() {
        User user = new User();
        user.setU_id(1);
        Assertions.assertEquals(1, user.getU_id());
    }

    @Test
    public void testGetUname() {
        User user = new User();
        user.setUname("Test User");
        Assertions.assertEquals("Test User", user.getUname());
    }

    @Test
    public void testGetUemail() {
        User user = new User();
        user.setUemail("test@test.com");
        Assertions.assertEquals("test@test.com", user.getUemail());
    }

    @Test
    public void testGetUpassword() {
        User user = new User();
        user.setUpassword("password");
        Assertions.assertEquals("password", user.getUpassword());
    }

    @Test
    public void testGetUnumber() {
        User user = new User();
        user.setUnumber(1234567890L);
        Assertions.assertEquals(1234567890L, user.getUnumber());
    }

    @Test
    public void testGetOrders() {
        User user = new User();
        Orders order = new Orders();
        ArrayList<Orders> orders = new ArrayList<>();
        orders.add(order);
        user.setOrders(orders);
        Assertions.assertEquals(orders, user.getOrders());
    }

    @Test
    public void testToString() {
        User user = new User();
        user.setU_id(1);
        user.setUname("Test User");
        user.setUemail("test@test.com");
        user.setUpassword("password");
        user.setUnumber(1234567890L);
        Orders order = new Orders();
        ArrayList<Orders> orders = new ArrayList<>();
        orders.add(order);
        user.setOrders(orders);
        String expectedString = "User [u_id=" + 1 + ", uname=" + "Test User" + ", uemail=" + "test@test.com" + ", upassword=" + "password"
                + ", unumber=" + 1234567890L + ", orders=" + orders + "]";
        Assertions.assertEquals(expectedString, user.toString());
    }
}