package com.arthraj.demo;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Log {

    private static final Logger logger = Logger.getLogger(Log.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);

        try {
            divideNumbers(10, 0);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred while dividing numbers", e);
        }

        logger.info("Program execution completed.");
    }

    private static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero error.");
        }

        return dividend / divisor;
    }
}