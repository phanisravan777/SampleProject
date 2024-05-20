package com.business.basiclogics.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.business.basiclogics.Logic;

public class LogicTest {

    @Test
    public void testCountTotal() {
        // Test Case 1: Basic functionality
        double price = 10.0;
        int quantity = 5;
        double expected = 50.0;
        double actual = Logic.countTotal(price, quantity);
        assertEquals(expected, actual, 0.001);

        // Test Case 2: Zero quantity
        price = 10.0;
        quantity = 0;
        expected = 0.0;
        actual = Logic.countTotal(price, quantity);
        assertEquals(expected, actual, 0.001);

        // Test Case 3: Zero price
        price = 0.0;
        quantity = 5;
        expected = 0.0;
        actual = Logic.countTotal(price, quantity);
        assertEquals(expected, actual, 0.001);

        // Test Case 4: Negative price
        price = -10.0;
        quantity = 5;
        expected = -50.0;
        actual = Logic.countTotal(price, quantity);
        assertEquals(expected, actual, 0.001);

        // Test Case 5: Negative quantity
        price = 10.0;
        quantity = -5;
        expected = -50.0;
        actual = Logic.countTotal(price, quantity);
        assertEquals(expected, actual, 0.001);
    }
}