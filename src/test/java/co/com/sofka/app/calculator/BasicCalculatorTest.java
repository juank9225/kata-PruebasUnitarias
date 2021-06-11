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
}
