package test.java.calculator;

import org.junit.jupiter.api.Test;

import main.java.calculator.StringCalculator;

import static org.junit.jupiter.api.Assertions.*;
public class TestStringCalculator {
	


	    @Test
	    void empty_string_should_return_0() {
	        StringCalculator stringCalculator = new StringCalculator();
	        assertEquals(0, stringCalculator.add(""));
	    }

	    @Test
	    void string_with_single_number_should_return_number_as_int() {
	        StringCalculator stringCalculator = new StringCalculator();
	        assertEquals(1, stringCalculator.add("1"));
	    }
	}



