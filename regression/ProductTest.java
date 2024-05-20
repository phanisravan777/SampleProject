package com.business.entities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testGetPid() {
        Product product = new Product();
        product.setPid(1);
        assertEquals(1, product.getPid());
    }

    @Test
    public void testSetPid() {
        Product product = new Product();
        product.setPid(2);
        assertEquals(2, product.getPid());
    }

    @Test
    public void testGetPname() {
        Product product = new Product();
        product.setPname("Test Product");
        assertEquals("Test Product", product.getPname());
    }

    @Test
    public void testSetPname() {
        Product product = new Product();
        product.setPname("New Product");
        assertEquals("New Product", product.getPname());
    }

    @Test
    public void testGetPprice() {
        Product product = new Product();
        product.setPprice(99.99);
        assertEquals(99.99, product.getPprice());
    }

    @Test
    public void testSetPprice() {
        Product product = new Product();
        product.setPprice(199.99);
        assertEquals(199.99, product.getPprice());
    }

    @Test
    public void testGetPdescription() {
        Product product = new Product();
        product.setPdescription("This is a test product.");
        assertEquals("This is a test product.", product.getPdescription());
    }

    @Test
    public void testSetPdescription() {
        Product product = new Product();
        product.setPdescription("This is a new product.");
        assertEquals("This is a new product.", product.getPdescription());
    }

    @Test
    public void testToString() {
        Product product = new Product();
        product.setPid(1);
        product.setPname("Test Product");
        product.setPprice(99.99);
        product.setPdescription("This is a test product.");
        String expectedOutput = "Product [pid=1, pname=Test Product, pprice=99.99, pdescription=This is a test product.]";
        assertEquals(expectedOutput, product.toString());
    }
}