package calc;

public class Calculatortest {
    public static void main(String[] args) {
    Calculator calculator=new Calculator();
   int result= calculator.plus(3,7);
        System.out.println(result);

        result=calculator.minus(7,3);
        System.out.println(result);

        long l=calculator.multiple(10,3);
        System.out.println(l);

        double d=calculator.divide(10,3);
        System.out.println(d);

    }

}
