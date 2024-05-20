package com.business.basiclogics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogicTest {

    @Test
    public void testCountTotal() {
        Logic logic = new Logic();

        // Test case 1: Normal case
        double price = 10.0;
        int quantity = 5;
        double expected = 50.0;
        assertEquals(expected, logic.countTotal(price, quantity));

        // Test case 2: Zero quantity
        price = 10.0;
        quantity = 0;
        expected = 0.0;
        assertEquals(expected, logic.countTotal(price, quantity));

        // Test case 3: Zero price
        price = 0.0;
        quantity = 5;
        expected = 0.0;
        assertEquals(expected, logic.countTotal(price, quantity));

        // Test case 4: Negative price
        price = -10.0;
        quantity = 5;
        expected = -50.0;
        assertEquals(expected, logic.countTotal(price, quantity));

        // Test case 5: Negative quantity
        price = 10.0;
        quantity = -5;
        expected = -50.0;
        assertEquals(expected, logic.countTotal(price, quantity));
    }
}