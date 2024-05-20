package com.business.loginCredentials;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdminLoginTest {

    @Test
    public void testEmailSetterAndGetter() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setEmail("admin@example.com");
        assertEquals("admin@example.com", adminLogin.getEmail());
    }

    @Test
    public void testPasswordSetterAndGetter() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setPassword("password123");
        assertEquals("password123", adminLogin.getPassword());
    }

    @Test
    public void testToString() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setEmail("admin@example.com");
        adminLogin.setPassword("password123");
        String expectedOutput = "AdminLogin [name=admin@example.com, password=password123]";
        assertEquals(expectedOutput, adminLogin.toString());
    }
}