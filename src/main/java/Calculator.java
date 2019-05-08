import calculations.*;

public class Calculator {
    private double result = 0;

    public double calculate(String entry) {
        if (entry == null){
            throw new IllegalArgumentException("Entry cannot be null");
        }
        EquationComponents equationComponents = EntryProcessor.processEntry(entry);
        if (equationComponents.getOperator().equals("+")) {
            Calculation calculation = new Addition(equationComponents.getArgumentA(), equationComponents.getArgumentB());
            result = calculation.calculate();
        }
        if (equationComponents.getOperator().equals("-")) {
            Calculation calculation = new Subtraction(equationComponents.getArgumentA(), equationComponents.getArgumentB());
            result = calculation.calculate();
        }
        if (equationComponents.getOperator().equals("*")) {
            Calculation calculation = new Multiplication(equationComponents.getArgumentA(), equationComponents.getArgumentB());
            result = calculation.calculate();
        }
        if (equationComponents.getOperator().equals("/")) {
            Calculation calculation = new Division(equationComponents.getArgumentA(), equationComponents.getArgumentB());
            result = calculation.calculate();
        }
        System.out.println("The result is: " + result);
        return result;
    }
}
