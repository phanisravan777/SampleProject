package com.business.entities.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.business.entities.Admin;

public class AdminTest {

    private Admin admin;

    @BeforeEach
    public void setUp() {
        admin = new Admin();
    }

    @Test
    public void testAdminId() {
        int id = 1;
        admin.setAdminId(id);
        assertEquals(id, admin.getAdminId());
    }

    @Test
    public void testAdminName() {
        String name = "Test Admin";
        admin.setAdminName(name);
        assertEquals(name, admin.getAdminName());
    }

    @Test
    public void testAdminEmail() {
        String email = "test@admin.com";
        admin.setAdminEmail(email);
        assertEquals(email, admin.getAdminEmail());
    }

    @Test
    public void testAdminPassword() {
        String password = "1234";
        admin.setAdminPassword(password);
        assertEquals(password, admin.getAdminPassword());
    }

    @Test
    public void testAdminNumber() {
        String number = "1234567890";
        admin.setAdminNumber(number);
        assertEquals(number, admin.getAdminNumber());
    }

    @Test
    public void testToString() {
        admin.setAdminId(1);
        admin.setAdminName("Test Admin");
        admin.setAdminEmail("test@admin.com");
        admin.setAdminPassword("1234");
        admin.setAdminNumber("1234567890");
        String expectedOutput = "Admin [adminId=1, adminName=Test Admin, adminEmail=test@admin.com, adminPassword=1234, adminNumber=1234567890]";
        assertEquals(expectedOutput, admin.toString());
    }
}