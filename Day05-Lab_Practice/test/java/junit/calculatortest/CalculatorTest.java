package junit.calculatortest;

import com.junit.calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Class to test the functionalities of calculator
public class CalculatorTest {
    // Creating an instance of Calculator
    private final Calculator calculator = new Calculator();

    // Creating a test Method for addition
    @Test
    void testAddition() {
        // Checking if adding two positive numbers gives the correct result.
        assertEquals(11, calculator.add(4, 7));

        // Checking addition of negative numbers.
        assertEquals(-7, calculator.add(-4, -3));
    }

    // Creating a test Method for Subtraction
    @Test
    void testSubtraction() {
        // testing weather expected and actual result match or not
        assertEquals(4, calculator.subtract(10, 6));

        // testing when the second number is larger
        assertEquals(-3, calculator.subtract(7, 10));
    }

    // Creating test method for Multiplication
    @Test
    void testMultiplication() {
        // Checking multiplication of two positive numbers.
        assertEquals(28, calculator.multiply(4, 7));

        // Multiplication with zero should always return zero.
        assertEquals(0, calculator.multiply(10, 0));

        // Checking multiplication of a positive and a negative number.
        assertEquals(-35, calculator.multiply(7, -5));

        // Checking multiplication of two negative numbers
        assertEquals(20, calculator.multiply(-4, -5));
    }

    // Creating a test method Division
    @Test
    void testDivision() {
        // Checking division of two positive numbers.
        assertEquals(4, calculator.divide(8, 2));

        // Verifying division where the result is not a whole number
        assertEquals(3, calculator.divide(7, 2));

        // Checking division of a negative by a positive number.
        assertEquals(-2, calculator.divide(-6, 3));

        // Checking division of two negative numbers
        assertEquals(3, calculator.divide(-12, -4));
    }

    @Test
    void testDivisionByZero() {
        //Testing weather dividing by 0 number throw exception or not
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(50, 0));

        // testing the equality of the actual and expected message
        assertEquals("Division by zero is not allowed.", exception.getMessage());
    }
}
