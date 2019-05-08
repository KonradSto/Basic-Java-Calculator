import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Please enter equation");
        Scanner input = new Scanner(System.in);
        String entry = input.nextLine();
        while (!EntryValidator.isLineValid(entry)) {
            System.out.println("Wrong equation entered, please enter equation again");
            entry = input.nextLine();
        }
        Calculator calculator = new Calculator();
        calculator.calculate(entry);
    }
}
