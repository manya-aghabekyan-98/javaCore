package author;

import java.util.Scanner;

import static sun.misc.Version.print;

public class AuthorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthorStorage authorStorage = new AuthorStorage();
        System.out.println(" please input count of authors");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(" please input count of author՞s  name");
            String name = scanner.nextLine();
            System.out.println(" please input count of author՞s  surname");
            String surname = scanner.nextLine();
            System.out.println(" please input count of author՞s email");
            String email = scanner.nextLine();
            System.out.println(" please input count of author՞s gender");
            String gender = scanner.nextLine();
            System.out.println(" please input count of author՞s age");
            int age = Integer.parseInt(scanner.nextLine());




        }
        authorStorage.print();


    }
}










