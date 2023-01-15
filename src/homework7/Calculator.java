package homework7;

public class Calculator {
    void plus(double a, double b) {

        double res;
        res = a + b;
        System.out.println("Additional result = " + res);
    }

    void minus(double a, double b) {
        double res;
        res = a - b;
        System.out.println("Subtraction result = " + res);
    }

    void divide(double a, double b) {
        double res;
        res = a / b;
        if (b == 0) {
            System.out.println("Զրոի չի կարելի բաժանել");
        } else System.out.println(res);
        System.out.println("Division result = " + res);
    }

    void multiply(double a, double b) {
        double res;
        res = a * b;
        System.out.println("Multiplication result = " + res);
    }

}
