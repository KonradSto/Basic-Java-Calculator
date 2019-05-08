import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EntryProcessorTest {

    @Test
    void shouldReturnCorrectArgumentsAndOperator() {
        //Given
        double argument1 = 9.8;
        double argument2 = 1.3;
        String operator = "+";
        EquationComponents actualEquationComponents;

        //When
        actualEquationComponents = EntryProcessor.processEntry("9.8 + 1.3");

        //Then
        assertEquals(argument1, actualEquationComponents.getArgumentA());
        assertEquals(argument2, actualEquationComponents.getArgumentB());
        assertEquals(operator, actualEquationComponents.getOperator());
    }

    @Test
    void shouldReturnFalseForIncorrectArgumentsAndOperator() {
        //Given
        double argument1 = 8.9;
        double argument2 = 1.2;
        String operator = "-";
        EquationComponents actualEquationComponents;

        //When
        actualEquationComponents = EntryProcessor.processEntry("9.8 + 1.3");

        //Then
        assertFalse(argument1 == actualEquationComponents.getArgumentA());
        assertFalse(argument2 == actualEquationComponents.getArgumentB());
        assertNotEquals(operator, actualEquationComponents.getOperator());
    }
}
