package nl.han.ica.oose.dea;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StringCalculatorTest {
    public StringCalculator stringCalculator;

    @BeforeEach
    public void setup() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void emptyStringTest() {
        try {
            assertEquals(0, stringCalculator.add(""));
        } catch (negativeNumberException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void singleDigitTest() {
        try {
            assertEquals(5, stringCalculator.add("5"));
        } catch (negativeNumberException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void multiDigitTest() {
        try {
            assertEquals(25, stringCalculator.add("15,5,5"));
        } catch (negativeNumberException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void multiDelimiterTest() {
        try {
            assertEquals(6, stringCalculator.add("1\n2,3"));
        } catch (negativeNumberException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void customDelimiterTest() {
        var numbers = "//*\n8*2";
        try {
            assertEquals(10, stringCalculator.add(numbers));
        } catch (negativeNumberException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void NegativeTest() {
        try {
            stringCalculator.add("1\n-2,-3");
            fail("Expected NumberFormatException");
        } catch (negativeNumberException e) {
        }
    }
}

