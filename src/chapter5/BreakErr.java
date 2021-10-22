package chapter5;

public class BreakErr {
    public static void main(String[] args) {
        one:for (int i = 0; i < 3; i++) {
        System.out.print("Проход"+1+":");

        }
        for (int j = 0; j < 100; j++) {
            if (j==10) break ;
            System.out.print(j+" ");

        }
    }
}
