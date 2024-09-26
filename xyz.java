public class xyz {
    /**
 * The TemperatureConverter class provides methods for converting temperature
 * between Fahrenheit and Celsius. It is designed to demonstrate basic
 * arithmetic operations and simple conversions.
 * 
 * <p>This class can be useful in educational contexts, small projects, and
 * simple temperature-related calculations. In a professional context, it 
 * provides the basis for understanding how temperature conversion works.
 */
public class TemperatureConverter {

    /**
     * Converts temperature from Fahrenheit to Celsius.
     * 
     * <p>This method takes a temperature value in degrees Fahrenheit and converts
     * it to degrees Celsius using the following formula:
     * <pre>{@code
     * (5.0 / 9.0) * (fahrenheit - 32)
     * }</pre>
     *
     * @param fahrenheit Temperature in degrees Fahrenheit.
     * @return Temperature in degrees Celsius.
     *
     * @example
     * Here is an example usage:
     * <pre>{@code
     * TemperatureConverter converter = new TemperatureConverter();
     * double celsius = converter.fahrenheitToCelsius(98.6);
     * // celsius should be approximately 37.0
     * }</pre>
     */
    public double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}

    