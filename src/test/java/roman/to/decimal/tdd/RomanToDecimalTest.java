package roman.to.decimal.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class RomanToDecimalTest {

    RomanToDecimal romanToDecimal;

    @BeforeEach
    void setUp() {
        romanToDecimal = new RomanToDecimal();
    }


    @AfterEach
    void tearDown() {
    }

    @Test
        void returnsZeroWhenPassedNothing() {
        //SEAT

        //Setup
        BigDecimal expected = new BigDecimal(0.0);

        //Exercise
        BigDecimal actual = romanToDecimal.convertToDecimal("");

        //Assert
        assertEquals(actual, expected);
    }

    @Test
    void returnsOneWhenPassedOne() {
        //Setup
        BigDecimal expected = new BigDecimal(1.0);

        //Exercise
        BigDecimal actual = romanToDecimal.convertToDecimal("I");

        //Assert
        assertEquals(actual, expected);
    }

    @Test
    void returnsFiveWhenPassedFive() {
        //Setup
        BigDecimal expected = new BigDecimal(5.0);

        //Exercise
        BigDecimal actual = romanToDecimal.convertToDecimal("V");

        //Assert
        assertEquals(actual, expected);
    }

    @Test
    void returnsTenWhenPassedTen() {
        //Setup
        BigDecimal expected = new BigDecimal(10.0);

        //Exercise
        BigDecimal actual = romanToDecimal.convertToDecimal("X");

        //Assert
        assertEquals(actual, expected);
    }


    @Test
    void returnsFiftyWhenPassedFifty() {
        //Setup
        BigDecimal expected = new BigDecimal(50.0);

        //Exercise
        BigDecimal actual = romanToDecimal.convertToDecimal("L");

        //Assert
        assertEquals(actual, expected);
    }

    //* One Application class with the top level convertRomanToDecimal method
//* Use an interface or base class for abstract class for Roman Numerals
//* One Class for each of the 7 possible Roman Numerals
//* Each Roman Numeral class has behavior to get it's decimal value
//* Only interact with the interface type in the Application class


//    The Kata says you should write a function to convert from Roman Numerals to decimal numerals. In order to keep the kata light, we will not check for valid Roman Numeral.
//
//    Roman numerals, the numeral system of ancient Rome, uses combinations of letters from the Latin alphabet to signify values. They are based on seven symbols:
//
//    Symbol	Value
//    I	1
//    V	5
//    X	10
//    L	50
//    C	100
//    D	500
//    M	1000
//    Numbers are formed by combining symbols together and adding the values. Generally, symbols are placed in order of value, starting with the largest values. When smaller values precede larger values, the smaller values are subtracted from the larger values, and the result is added to the total.
//
//            Example:
//
//    Roman Number	Computation	Value	Comment
//    MMVI	1000 + 1000 + 5 + 1	2006	only addition
//    MCMXLIV	1000 + (1000 - 100) + (50 - 10) + (5 - 1)	1944	addition and substraction

}