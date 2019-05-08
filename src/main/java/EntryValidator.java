public class EntryValidator {
    public static boolean isLineValid(String line) {
        if (line == null || line.trim().isEmpty()) {
            return false;
        }
        return line.matches("^\\d+(\\.\\d+)?\\s*[\\+\\-\\*\\/]\\s*\\d+(\\.\\d+)?$");
    }
}
