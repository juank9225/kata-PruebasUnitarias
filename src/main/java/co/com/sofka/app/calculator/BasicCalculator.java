package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long substraction(Long number1, Long number2){
        logger.info( "Subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long mulplication(Long number1, Long number2){
        logger.info( "Multiplying {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long division(Long number1, Long number2){
        logger.info( "Dividing {} / {}", number1, number2 );
        if (number2 == 0){
            throw new RuntimeException("No se puede dividir por cero");
        }
        return number1 / number2;
    }

}
