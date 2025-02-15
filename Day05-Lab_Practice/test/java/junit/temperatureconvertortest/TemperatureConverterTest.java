package junit.temperatureconvertortest;

import com.junit.temperatureconvertor.TemperatureConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Class to test the conversion of temperature
public class TemperatureConverterTest {
	private final TemperatureConverter converter = new TemperatureConverter();

	// Method to test conversion of Celsius to Fahrenheit
	@Test
	void testCelsiusToFahrenheit() {
		// Testing weather conversion method convert perfectly and check the expected temperature same as actual result
		assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.01);
		assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.01);
	}

	// Method to test conversion of Fahrenheit to Celsius
	@Test
	void testFahrenheitToCelsius() {
		// testing weather fahrenheitToCelsius conversion give result as expected
		assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.01);
		assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.01);
	}
}
