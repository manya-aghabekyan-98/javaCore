import lesson9.ScannerExample;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Calculator calculator=new Calculator();
        boolean isWrongCommand;
        while (true){
         System.out.println("please input operation(+,-,*,/or 0 for exit");
        String operation=scanner.next();
        if (operation.equals("0")){
        System.exit(0);

        }
        if (!operation.equals("+")&&!operation.equals("-")&& !operation.equals("*")&& operation.equals("/")){
            System.out.println("invalid operation");
        }else {
            System.out.println("please input a");
            int a = scanner.nextInt();
            System.out.println("please input b");
            int b = scanner.nextInt();
            switch (operation){
                case "+":
                    System.out.println(calculator);
                    break;
                case "-":
                    System.out.println(calculator);
                    break;
                case "*":
                    System.out.println(calculator);
                    break;
                case "/":
                    System.out.println(calculator);
                    break;
        }




        }
    }
}
}
}
