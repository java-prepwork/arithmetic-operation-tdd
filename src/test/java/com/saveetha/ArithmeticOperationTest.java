package com.saveetha;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest {
    @Nested
    class Addition {
        @Test
        void toReturnFiveWhenTwoIsAddedWithThree() {

            // AAA

            // Arrange
            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int two = 2, three = 3, five = 5;

            // Act
            int actualSum = arithmeticOperation.add(two, three);

            // Assert
            assertEquals(five, actualSum);
        }

        @Test
        void toReturnMinusFiveWhenMinusSevenIsAddedWithTwo() {

            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int minusFive = -5, minusSeven = -7, two = 2;

            int actualSum = arithmeticOperation.add(two, minusSeven);

            assertEquals(minusFive, actualSum);
        }
    }

}
