package HWFive.TasksTwo;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public long sum(long a, long b) {
        return a + b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public long division(long a, long b) {
        return a / b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public long multiplication(long a, long b) {
        return a * b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public long subtraction(long a, long b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.sum(5, 10));
        System.out.println(calc.division(10.2, 2.0));
        System.out.println(calc.multiplication(100000l, 200000l));
        System.out.println(calc.subtraction(-100.15, 10));
    }

}
