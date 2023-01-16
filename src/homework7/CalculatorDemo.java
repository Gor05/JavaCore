package homework7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println(cl.plus(2, 8));
        System.out.println(cl.minus(5, 3));
        System.out.println(cl.divide(100, 25));
        System.out.println(cl.multiply(7,8));
    }
}