package com.business.controllers.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import com.business.entities.Product;
import com.business.loginCredentials.AdminLogin;
import com.business.services.ProductServices;

public class HomeControllerTest {

    @InjectMocks
    HomeController homeController;

    @Mock
    ProductServices productServices;

    @Mock
    Model model;

    @Test
    public void testHome() {
        String view = homeController.home();
        assertEquals("Home", view);
    }

    @Test
    public void testProducts() {
        List<Product> allProducts = new ArrayList<>();
        when(productServices.getAllProducts()).thenReturn(allProducts);
        String view = homeController.products(model);
        assertEquals("Products", view);
    }

    @Test
    public void testLocation() {
        String view = homeController.location();
        assertEquals("Locate_us", view);
    }

    @Test
    public void testAbout() {
        String view = homeController.about();
        assertEquals("About", view);
    }

    @Test
    public void testLogin() {
        AdminLogin adminLogin = new AdminLogin();
        when(model.addAttribute("adminLogin", adminLogin)).thenReturn(model);
        String view = homeController.login(model);
        assertEquals("Login", view);
    }
}