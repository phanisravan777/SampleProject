package com.business.controllers.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.business.basiclogics.Logic;
import com.business.controllers.AdminController;
import com.business.entities.Admin;
import com.business.entities.Orders;
import com.business.entities.Product;
import com.business.entities.User;
import com.business.loginCredentials.AdminLogin;
import com.business.loginCredentials.UserLogin;
import com.business.services.AdminServices;
import com.business.services.OrderServices;
import com.business.services.ProductServices;
import com.business.services.UserServices;

public class AdminControllerTest {

    @InjectMocks
    private AdminController adminController;

    @Mock
    private UserServices userServices;

    @Mock
    private AdminServices adminServices;

    @Mock
    private ProductServices productServices;

    @Mock
    private OrderServices orderServices;

    @Mock
    private Model model;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllData() {
        AdminLogin login = new AdminLogin();
        login.setEmail("test@test.com");
        login.setPassword("password");
        when(adminServices.validateAdminCredentials(anyString(), anyString())).thenReturn(true);
        String view = adminController.getAllData(login, model);
        assertEquals("redirect:/admin/services", view);
    }

    @Test
    public void testUserLogin() {
        UserLogin login = new UserLogin();
        login.setUserEmail("test@test.com");
        login.setUserPassword("password");
        when(userServices.validateLoginCredentials(anyString(), anyString())).thenReturn(true);
        User user = new User();
        when(userServices.getUserByEmail(anyString())).thenReturn(user);
        List<Orders> orders = new ArrayList<>();
        when(orderServices.getOrdersForUser(any())).thenReturn(orders);
        String view = adminController.userLogin(login, model);
        assertEquals("BuyProduct", view);
    }

    // Add more test methods here

}