package co.com.sofka.app.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorTest {
    private BasicCalculator cal;

    @BeforeEach
    public void setup(){
        cal = new BasicCalculator();
    }


    @DisplayName("Testing several sums")
    @ParameterizedTest(name="{0}+{1}={2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, cal.sum(first,second),
                ()->first+" "+second+" should equal "+ expectedResult);
    }

    @DisplayName("Testing several Subtracting")
    @ParameterizedTest(name = "{1}-{2}={1}")
    @CsvSource({
            "0, 1, -1",
            "2, 1, 1",
            "50, 20, 30",
            "40, 30, 10"
    })
    public void severalSubtracting(Long first, Long second, Long expectedResult){
        assertEquals(expectedResult,cal.substraction(first,second),
                ()->first+" "+second+"should equal "+expectedResult);
    }

    @DisplayName("Testing several Subtracting")
    @ParameterizedTest(name = "{1}x{2}={1}")
    @CsvSource({
            "0, 1, 0",
            "2, 1, 2",
            "50, 20, 1000",
            "40, 30, 1200"
    })
    public void severalmulplication(Long first, Long second, Long expectedResult){
        assertEquals(expectedResult,cal.mulplication(first,second),
                ()->first+" "+second+"should equal "+expectedResult);
    }
}
