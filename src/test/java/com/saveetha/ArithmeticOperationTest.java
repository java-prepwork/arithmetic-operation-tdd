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

        @Test
        void toReturnTwoWhenZeroIsAddedWithTwo() {

            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int zero = 0, two = 2;

            int actualSum = arithmeticOperation.add(two, zero);

            assertEquals(two, actualSum);
        }
    }

    @Nested
    class Subtraction {
        @Test
        void toReturnTwoWhenFiveIsSubtractedWithThree() {

            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int two = 2, three = 3, five = 5;

            int actualDifference = arithmeticOperation.sub(five, three);

            assertEquals(two, actualDifference);
        }

        @Test
        void toReturnMinusNineWhenMinusSevenIsSubtractedWithTwo() {

            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int minusSeven = -7, minusNine = -9, two = 2;

            int actualSum = arithmeticOperation.sub(minusSeven, two);

            assertEquals(minusNine, actualSum);
        }

        @Test
        void toReturnMinusTwoWhenZeroIsSubtractedWithTwo() {

            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int zero = 0, two = 2, minusTwo = -2;

            int actualDifference = arithmeticOperation.sub(zero, two);

            assertEquals(minusTwo, actualDifference);
        }

        @Test
        void toReturnZeroWhenZeroIsSubtractedWithZero() {

            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int zero = 0;

            int actualDifference = arithmeticOperation.sub(zero, zero);

            assertEquals(zero, actualDifference);
        }
    }

    @Nested
    class Multiplication {
        @Test
        void toReturnFifteenWhenFiveIsMultipliedWithThree() {

            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int three = 3, five = 5, fifteen = 15;

            int actualProduct = arithmeticOperation.multiply(five, three);

            assertEquals(fifteen, actualProduct);
        }

        @Test
        void toReturnMinusFourteenWhenMinusSevenIsMultipliedWithTwo() {

            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int minusSeven = -7, minusFourteen = -14, two = 2;

            int actualProduct = arithmeticOperation.multiply(minusSeven, two);

            assertEquals(minusFourteen, actualProduct);
        }

        @Test
        void toReturnZeroWhenZeroIsMultipliedWithMinusTwo() {

            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int zero = 0, minusTwo = -2;

            int actualProduct = arithmeticOperation.multiply(zero, minusTwo);

            assertEquals(zero, actualProduct);
        }

        @Test
        void toReturnZeroWhenZeroIsMultipliedWithZero() {

            ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
            int zero = 0;

            int actualProduct = arithmeticOperation.multiply(zero, zero);

            assertEquals(zero, actualProduct);
        }
    }


}
