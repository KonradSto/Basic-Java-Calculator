import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EntryProcessorTest {

    @Test
    void shouldReturnCorrectArgumentsAndOperator(){
        //Given
        double argument1 = 9.8;
        double argument2 = 1.3;
        String operator = "+";
        EquationComponents actualEquationComponents = new EquationComponents();

        //When
        actualEquationComponents = EntryProcessor.processEntry("9.8 + 1.3");

        //Then
        assertTrue(argument1 == actualEquationComponents.argumentA);
        assertTrue(argument2 == actualEquationComponents.argumentB);
        assertTrue(operator.equals(actualEquationComponents.operator));
    }
}
