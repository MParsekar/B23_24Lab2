import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // Test case for adding two positive numbers
    @Test
    public void testAddPositiveNumbers() {
        // Arrange
        double num1 = 5.0;
        double num2 = 3.0;

        // Act
        double result = Calculator.add(num1, num2);

        // Assert
        assertEquals(8.0, result);
    }

    // Test case for adding a positive and a negative number
    @Test
    public void testAddPositiveAndNegativeNumbers() {
        // Arrange
        double num1 = 5.0;
        double num2 = -3.0;

        // Act
        double result = Calculator.add(num1, num2);

        // Assert
        assertEquals(2.0, result);
    }

    // Test case for adding two negative numbers
    @Test
    public void testAddNegativeNumbers() {
        // Arrange
        double num1 = -5.0;
        double num2 = -3.0;

        // Act
        double result = Calculator.add(num1, num2);

        // Assert
        assertEquals(-8.0, result);
    }

    // Test case for adding zero to a number
    @Test
    public void testAddZero() {
        // Arrange
        double num1 = 5.0;
        double num2 = 0.0;

        // Act
        double result = Calculator.add(num1, num2);

        // Assert
        assertEquals(5.0, result);
    }

    // Add more test cases as needed
}
