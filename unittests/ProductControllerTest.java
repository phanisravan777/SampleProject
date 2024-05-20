package com.business.controllers.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.business.entities.Product;
import com.business.services.ProductServices;

public class ProductControllerTest {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductServices productServices;

    @Mock
    private Model model;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddProduct() {
        Product product = new Product();
        when(productServices.addProduct(product)).thenReturn(product);
        String view = productController.addProduct(product);
        verify(productServices).addProduct(product);
        assertEquals("redirect:/admin/services", view);
    }

    @Test
    public void testUpdateProduct() {
        Product product = new Product();
        int id = 1;
        when(productServices.updateProduct(product, id)).thenReturn(product);
        String view = productController.updateProduct(product, id);
        verify(productServices).updateProduct(product, id);
        assertEquals("redirect:/admin/services", view);
    }

    @Test
    public void testDeleteProduct() {
        int id = 1;
        String view = productController.deleteProduct(id);
        verify(productServices).deleteProduct(id);
        assertEquals("redirect:/admin/services", view);
    }
}