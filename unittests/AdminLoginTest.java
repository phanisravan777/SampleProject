package com.business.loginCredentials;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdminLoginTest {

    @Test
    public void testGetEmail() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setEmail("admin@example.com");
        assertEquals("admin@example.com", adminLogin.getEmail());
    }

    @Test
    public void testSetEmail() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setEmail("admin@example.com");
        assertEquals("admin@example.com", adminLogin.getEmail());
    }

    @Test
    public void testGetPassword() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setPassword("password123");
        assertEquals("password123", adminLogin.getPassword());
    }

    @Test
    public void testSetPassword() {
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

    // Edge Cases
    @Test
    public void testNullEmail() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setEmail(null);
        assertNull(adminLogin.getEmail());
    }

    @Test
    public void testNullPassword() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setPassword(null);
        assertNull(adminLogin.getPassword());
    }

    @Test
    public void testEmptyEmail() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setEmail("");
        assertEquals("", adminLogin.getEmail());
    }

    @Test
    public void testEmptyPassword() {
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setPassword("");
        assertEquals("", adminLogin.getPassword());
    }
}