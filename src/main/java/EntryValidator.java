public class EntryValidator {
    public static boolean isLineValid(String line) {
        if (line == null || line.trim().isEmpty()) {
            throw new IllegalArgumentException("Line cannot be null or empty");
        }
        return line.matches("^\\s*\\d+(\\.\\d+)?\\s*[\\+\\-\\*\\/]\\s*\\d+(\\.\\d+)?\\s*$");
    }
}
