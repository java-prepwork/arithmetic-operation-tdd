package com.saveetha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest {
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
}
