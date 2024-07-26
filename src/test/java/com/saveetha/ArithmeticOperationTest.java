package com.saveetha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest {
    @Test
    void toReturnFiveWhenTwoIsAddedWithThree() {

        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

        assertEquals(5, arithmeticOperation.add(2, 3));
    }
}
