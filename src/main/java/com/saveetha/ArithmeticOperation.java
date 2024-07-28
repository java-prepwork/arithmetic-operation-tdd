package com.saveetha;

import com.saveetha.exception.DivideByZeroException;

public class ArithmeticOperation {

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int sub(int number1, int number2) {
        return number1 - number2;
    }

    public int multiply(int number1, int number2) {
        return number1*number2;
    }

    public int divide(int number1, int number2) throws DivideByZeroException {

        try {
            return number1/number2;
        }
        catch (ArithmeticException e) {
            throw new DivideByZeroException("Divide by zero");
        }
    }
}
