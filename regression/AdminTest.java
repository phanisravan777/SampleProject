package com.business.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdminTest {

    @Test
    public void testAdminId() {
        Admin admin = new Admin();
        admin.setAdminId(1);
        assertEquals(1, admin.getAdminId());
    }

    @Test
    public void testAdminName() {
        Admin admin = new Admin();
        admin.setAdminName("Test Admin");
        assertEquals("Test Admin", admin.getAdminName());
    }

    @Test
    public void testAdminEmail() {
        Admin admin = new Admin();
        admin.setAdminEmail("test@admin.com");
        assertEquals("test@admin.com", admin.getAdminEmail());
    }

    @Test
    public void testAdminPassword() {
        Admin admin = new Admin();
        admin.setAdminPassword("1234");
        assertEquals("1234", admin.getAdminPassword());
    }

    @Test
    public void testAdminNumber() {
        Admin admin = new Admin();
        admin.setAdminNumber("1234567890");
        assertEquals("1234567890", admin.getAdminNumber());
    }

    @Test
    public void testToString() {
        Admin admin = new Admin();
        admin.setAdminId(1);
        admin.setAdminName("Test Admin");
        admin.setAdminEmail("test@admin.com");
        admin.setAdminPassword("1234");
        admin.setAdminNumber("1234567890");
        String expectedOutput = "Admin [adminId=1, adminName=Test Admin, adminEmail=test@admin.com, adminPassword=1234, adminNumber=1234567890]";
        assertEquals(expectedOutput, admin.toString());
    }
}