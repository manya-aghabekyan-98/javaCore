package lesson9;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please input a");
       int a= scanner.nextInt();
       System.out.println("please input b");
       int b=scanner.nextInt();
       System.out.println("sum ="+(a+b));

    }
}
