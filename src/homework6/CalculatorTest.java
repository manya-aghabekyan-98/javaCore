package homework6;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.plus(5, 8);
        System.out.println(result);
        result = calculator.minus(22,3);
        System.out.println(result);
        double d=calculator.divide(66,2);
        System.out.println(d);
        long l= calculator.multiple(48,21);
        System.out.println(l);
    }
}