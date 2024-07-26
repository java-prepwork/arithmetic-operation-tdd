package com.saveetha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest {
    @Test
    void toReturnFiveWhenTwoIsAddedWithThree() {

        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int two = 2, three = 3, five = 5;

        assertEquals(five, arithmeticOperation.add(two, three));
    }
}
