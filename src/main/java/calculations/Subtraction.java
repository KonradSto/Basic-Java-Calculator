package calculations;

public class Subtraction implements Calculation {
    private double a;
    private double b;

    public Subtraction(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate() {
        return (a - b);
    }
}
