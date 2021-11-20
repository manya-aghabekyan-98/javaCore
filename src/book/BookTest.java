package book;

import java.util.Scanner;

public class BookTest {
    static Scanner scanner = new Scanner(System.in);
    static BookStorage bookStorage = new BookStorage();
    private static final String ADD_BOOK = "0";
    private static final String PRINT_BOOKS = "1";
    private static final String SEARCH_BOOKS_BY_TITLE = "2";

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            String comand = scanner.nextLine();
            switch (comand) {
                case "ADD_BOOK":
                    addBook();
                    break;
                case "PRINT_BOOK":
                    booKStorage_print();
                    break;
                case "SEARCH_BOOKS_BY_TITLE":
                    searchBooksByTitle();
                    break;

                default:
                    System.out.println("invalid comand");
            }
        }


    }

    private static void booKStorage_print() {
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + PRINT_BOOKS + " for print book");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search books by title");
        S
    }


    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByTitle(keyword);
    }


    private static void addBook() {
        System.out.println(" please input count of books");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(" please input count of books title");
            String title = scanner.nextLine();
            System.out.println(" please input count of books description");
            String description = scanner.nextLine();
            System.out.println(" please input count of books price");
            double price = scanner.nextDouble();
            System.out.println(" please input count of books count");
            int count = scanner.nextInt();
            Book book = new Book(title, description, price, count);
            bookStorage.add(book);


        }
    }
}


