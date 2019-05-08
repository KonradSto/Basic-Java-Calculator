import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void shouldPerformCorrectCalculation(){
        //Given
        String entry = "9.8 + 1.3";
        double expectedResult = 11.1;

        //Then
        assertEquals(expectedResult, calculator.calculate(entry), 0.001);
        }
    }
