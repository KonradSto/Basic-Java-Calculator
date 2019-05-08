import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EntryValidatorTest {

    @Test
    void shouldReturnTrueForCorrectEntry(){
        //Given
        String correctEntry = "9.18   + 3.5";

        //Then
        assertTrue(EntryValidator.isLineValid(correctEntry));
    }

    @Test
    void shouldReturnFalseForIncorrectEntry(){
        //Given
        String incorrectEntry = "99 +- 66";

        //Then
        assertFalse(EntryValidator.isLineValid(incorrectEntry));
    }
}