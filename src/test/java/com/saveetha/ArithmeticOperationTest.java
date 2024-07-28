package com.saveetha;

import com.saveetha.exception.DivideByZeroException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticOperationTest {

    private static ArithmeticOperation arithmeticOperation;

    @BeforeAll
     static void beforeAll() {
        arithmeticOperation = new ArithmeticOperation();
    }
    @Nested
    class Addition {
        @Test
        void toReturnFiveWhenTwoIsAddedWithThree() {

            // AAA

            // Arrange
            int two = 2, three = 3, five = 5;

            // Act
            int actualSum = arithmeticOperation.add(two, three);

            // Assert
            assertEquals(five, actualSum);
        }

        @Test
        void toReturnMinusFiveWhenMinusSevenIsAddedWithTwo() {

            int minusFive = -5, minusSeven = -7, two = 2;

            int actualSum = arithmeticOperation.add(two, minusSeven);

            assertEquals(minusFive, actualSum);
        }

        @Test
        void toReturnTwoWhenZeroIsAddedWithTwo() {

            int zero = 0, two = 2;

            int actualSum = arithmeticOperation.add(two, zero);

            assertEquals(two, actualSum);
        }
    }

    @Nested
    class Subtraction {
        @Test
        void toReturnTwoWhenFiveIsSubtractedWithThree() {

            int two = 2, three = 3, five = 5;

            int actualDifference = arithmeticOperation.sub(five, three);

            assertEquals(two, actualDifference);
        }

        @Test
        void toReturnMinusNineWhenMinusSevenIsSubtractedWithTwo() {

            int minusSeven = -7, minusNine = -9, two = 2;

            int actualSum = arithmeticOperation.sub(minusSeven, two);

            assertEquals(minusNine, actualSum);
        }

        @Test
        void toReturnMinusTwoWhenZeroIsSubtractedWithTwo() {

            int zero = 0, two = 2, minusTwo = -2;

            int actualDifference = arithmeticOperation.sub(zero, two);

            assertEquals(minusTwo, actualDifference);
        }

        @Test
        void toReturnZeroWhenZeroIsSubtractedWithZero() {

            int zero = 0;

            int actualDifference = arithmeticOperation.sub(zero, zero);

            assertEquals(zero, actualDifference);
        }
    }

    @Nested
    class Multiplication {
        @Test
        void toReturnFifteenWhenFiveIsMultipliedWithThree() {

            int three = 3, five = 5, fifteen = 15;

            int actualProduct = arithmeticOperation.multiply(five, three);

            assertEquals(fifteen, actualProduct);
        }

        @Test
        void toReturnMinusFourteenWhenMinusSevenIsMultipliedWithTwo() {

            int minusSeven = -7, minusFourteen = -14, two = 2;

            int actualProduct = arithmeticOperation.multiply(minusSeven, two);

            assertEquals(minusFourteen, actualProduct);
        }

        @Test
        void toReturnZeroWhenZeroIsMultipliedWithMinusTwo() {

            int zero = 0, minusTwo = -2;

            int actualProduct = arithmeticOperation.multiply(zero, minusTwo);

            assertEquals(zero, actualProduct);
        }

        @Test
        void toReturnZeroWhenZeroIsMultipliedWithZero() {

            int zero = 0;

            int actualProduct = arithmeticOperation.multiply(zero, zero);

            assertEquals(zero, actualProduct);
        }
    }

    @Nested
    class Division {
        @Test
        void toReturnThreeWhenFifteenIsDividedByThree() throws DivideByZeroException {

            int three = 3, five = 5, fifteen = 15;

            int actualQuotient = arithmeticOperation.divide(fifteen, three);

            assertEquals(five, actualQuotient);
        }

        @Test
        void toReturnMinusTwoWhenMinusSevenIsDividedByThree() throws DivideByZeroException {

            int minusSeven = -7, minusTwo = -2, three = 3;

            int actualQuotient = arithmeticOperation.divide(minusSeven, three);

            assertEquals(minusTwo, actualQuotient);
        }

        @Test
        void toReturnZeroWhenZeroIsDividedByTwo() throws DivideByZeroException {

            int zero = 0, two = 2;

            int actualQuotient = arithmeticOperation.divide(zero, two);

            assertEquals(zero, actualQuotient);
        }

        @Test
        void toReturnZeroWhenTwoIsDividedByZero() throws DivideByZeroException {

            int zero = 0, two = 2;

            assertThrows(DivideByZeroException.class, ()-> { arithmeticOperation.divide(two, zero); });
        }
    }

}
