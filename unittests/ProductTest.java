package com.business.entities.test;

import com.business.entities.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testProduct() {
        Product product = new Product();

        // Test pid
        product.setPid(1);
        assertEquals(1, product.getPid());

        // Test pname
        product.setPname("Test Product");
        assertEquals("Test Product", product.getPname());

        // Test pprice
        product.setPprice(99.99);
        assertEquals(99.99, product.getPprice());

        // Test pdescription
        product.setPdescription("This is a test product.");
        assertEquals("This is a test product.", product.getPdescription());

        // Test toString
        String expectedString = "Product [pid=1, pname=Test Product, pprice=99.99, pdescription=This is a test product.]";
        assertEquals(expectedString, product.toString());
    }

    @Test
    public void testEdgeCases() {
        Product product = new Product();

        // Test pid with negative value
        product.setPid(-1);
        assertEquals(-1, product.getPid());

        // Test pname with null
        product.setPname(null);
        assertNull(product.getPname());

        // Test pprice with negative value
        product.setPprice(-99.99);
        assertEquals(-99.99, product.getPprice());

        // Test pdescription with null
        product.setPdescription(null);
        assertNull(product.getPdescription());
    }
}