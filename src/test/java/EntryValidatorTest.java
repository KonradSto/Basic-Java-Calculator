import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class EntryValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {"9.18   + 3.5", " 22-1.8", " 1  * 9 ", " 9 / 15.6"})
    void shouldReturnTrueForCorrectEntry(String entry) {
        assertTrue(EntryValidator.isLineValid(entry));
    }

    @ParameterizedTest
    @ValueSource(strings = {"99 +- 66", "8 12", "+ 6"})
    void shouldReturnFalseForIncorrectEntry(String entry) {
        assertFalse(EntryValidator.isLineValid(entry));
    }

    @ParameterizedTest
    @ValueSource(strings = {"  ", ""})
    void shouldThrowIllegalArgumentExceptionForEmptyLine(String line) {
        assertThrows(IllegalArgumentException.class, () -> EntryValidator.isLineValid(line));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionForNullLine() {
        assertThrows(IllegalArgumentException.class, () -> EntryValidator.isLineValid(null));
    }
}
