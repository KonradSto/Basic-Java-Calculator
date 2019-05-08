import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntryProcessor {
    public static EquationComponents processEntry(String entry) {
        double argumentA = 0;
        double argumentB = 0;
        String operator = "";
        if (!EntryValidator.isLineValid(entry)) {
            throw new IllegalArgumentException("Invalid entry");
        }
        Pattern p = Pattern.compile("(\\d+(\\.\\d+)?)");
        Matcher matcher = p.matcher(entry);
        if (matcher.find()) {
            argumentA = Double.parseDouble(matcher.group(0));
        }
        if (matcher.find()) {
            argumentB = Double.parseDouble(matcher.group(1));
        }
        if (entry.contains("+")) {
            operator = "+";
        }
        if (entry.contains("-")) {
            operator = "-";
        }
        if (entry.contains("*")) {
            operator = "*";
        }
        if (entry.contains("/")) {
            operator = "/";
        }
        return new EquationComponents(argumentA, argumentB, operator);
    }
}
