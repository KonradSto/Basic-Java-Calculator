public class EquationComponents {
    double argumentA;
    double argumentB;
    String operator;

    public EquationComponents() {
    }

    public EquationComponents(double argumentA, double argumentB, String operator) {
        this.argumentA = argumentA;
        this.argumentB = argumentB;
        this.operator = operator;
    }

    public double getArgumentA() {
        return argumentA;
    }

    public double getArgumentB() {
        return argumentB;
    }

    public String getOperator() {
        return operator;
    }

    public void setArgumentA(double argumentA) {
        this.argumentA = argumentA;
    }

    public void setArgumentB(double argumentB) {
        this.argumentB = argumentB;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
