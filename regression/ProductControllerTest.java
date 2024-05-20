package com.business.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.business.entities.Product;
import com.business.services.ProductServices;

@SpringBootTest
public class ProductControllerTest {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductServices productServices;

    @Test
    public void testAddProduct() {
        Product product = new Product();
        when(productServices.addProduct(product)).thenReturn("Added");
        String result = productController.addProduct(product);
        assertEquals("redirect:/admin/services", result);
    }

    @Test
    public void testUpdateProduct() {
        Product product = new Product();
        int id = 1;
        when(productServices.updateproduct(product, id)).thenReturn("Updated");
        String result = productController.updateProduct(product, id);
        assertEquals("redirect:/admin/services", result);
    }

    @Test
    public void testDeleteProduct() {
        int id = 1;
        when(productServices.deleteProduct(id)).thenReturn("Deleted");
        String result = productController.delete(id);
        assertEquals("redirect:/admin/services", result);
    }
}