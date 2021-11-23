package author1;

import java.util.Scanner;

public class AuthorBookTest {
    static Scanner scanner = new Scanner(System.in);
    static AuthorStorage authorStorage = new AuthorStorage();
    static BookStorage bookStorage = new BookStorage();

    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";
    private static final String SEARCH_BOOKS_BY_AUTHOR = "8";
    private static final String COUNT_BOOKS_BY_TITLE = "9";
    private static final String Change_Author = "10";
    private static final String Change_Book_Author = "11";



    public static void main(String[] args) {

        Author poxos = new Author("poxos", "poxosyan", 22, "poxos@mail.com", "male");
        authorStorage.add(poxos);
        Author poxosuhi = new Author("poxosuhi", "poxosyan", 23, "poxosuhi@mail.com", "female");
        authorStorage.add(poxosuhi);
        Author petros = new Author("petros", "petrosyan", 25, "petros@mail.com", "male");
        authorStorage.add(petros);
        Book book1 = new Book("girq1", "<<shun u katun>>", 2000, 425, poxos);
        Book book2 = new Book("girq2", "<<Anush>>", 3250, 587, poxos);
        Book book3 = new Book("girq3", " <<Sirel te chsirel>>", 5890, 689, poxosuhi);
        bookStorage.add(book1);
        bookStorage.add(book2);
        bookStorage.add(book3);


        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByName();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchBooksByTitle();
                    break;
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                case SEARCH_BOOKS_BY_AUTHOR:
                    searchBookByAuthorEmail();
                    break;
                case COUNT_BOOKS_BY_TITLE:
                    printCountOfBooksByAuthorEmail();
                    break;
                case  Change_Author:
                    changeAuthorEmail();
                    break;
                case  Change_Book_Author:
                    changeBookAuthor();
                    break;
                default:
                    System.out.println("Invalid command!");
            }

        }
    }

    private static void searchByEmail() {

    }

    private static void searchBooksByTitle() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        bookStorage.searchByTitle(keyword);
    }

    private static void addBook() {

        System.out.println("please choose author's email");
        System.out.println("--------");
        authorStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author != null) {
            System.out.println("please input book's title");
            String title = scanner.nextLine();
            System.out.println("please input book's description");
            String desc = scanner.nextLine();
            System.out.println("please input book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("please input book's count");
            int count = Integer.parseInt(scanner.nextLine());
            Book book = new Book(title, desc, price, count, author);

            bookStorage.add(book);

            System.out.println("Thank you, Book was added");
        } else {
            System.out.println("invalid email! please try again");
            addBook();
        }

    }

    private static void searchByAge() {
        System.out.println("please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_AUTHOR + " for add author");
        System.out.println("please input " + ADD_BOOK + " for add book");
        System.out.println("please input " + SEARCH_AUTHORS + " for search author by name");
        System.out.println("please input " + SEARCH_AUTHORS_BY_AGE + " for search author by age");
        System.out.println("please input " + SEARCH_BOOKS_BY_TITLE + " for search book by title");
        System.out.println("please input " + PRINT_AUTHORS + " for print authors");
        System.out.println("please input " + PRINT_BOOKS + " for print books");
        System.out.println("please input " + SEARCH_BOOKS_BY_AUTHOR + " for search book by author" + "\u001B[0m");
        System.out.println("please input " + COUNT_BOOKS_BY_TITLE + " for search book by author");
        System.out.println("please input " + Change_Author + " for search change author");
        System.out.println("please input " + Change_Book_Author+ " for change book author");
    }

    private static void searchByName() {
        System.out.println("please input keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() {
        System.out.println("please input author's name");
        String name = scanner.nextLine();
        System.out.println("please input author's surname");
        String surname = scanner.nextLine();
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println("please input author's gender");
        String gender = scanner.nextLine();
        System.out.println("please input author's age");
        int age = Integer.parseInt(scanner.nextLine());

        Author author = new Author(name, surname, age, email, gender);
        if (authorStorage.getByEmail(author.getEmail()) != null) {
            System.err.println("Invalid email. Author with this email already exists");
        } else {
            authorStorage.add(author);
            System.out.println("Thank you, author was added");
        }

    }

    private static void searchBookByAuthorEmail() {
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        bookStorage.searchBooksByAuthorEmail(email);
    }

    private static void printCountOfBooksByAuthorEmail() {
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        System.out.println(bookStorage.getCountBooksByAuthor(email));
    }

    private static void changeAuthorEmail() {
        System.out.println("please input author's email");
        String email = scanner.nextLine();
        Author author = authorStorage.getByEmail(email);
        if (author == null) {
            System.out.println("author with this email doesn't exists.");
            return;
        }
        System.out.println("please input author's new name");
        String name = scanner.nextLine();

        System.out.println("please input author's new surname");
        String surname = scanner.nextLine();

        System.out.println("please input author's new age");
        String ageStr = scanner.nextLine();

        System.out.println("please input author's new gender");
        String gender = scanner.nextLine();
        int age=Integer.parseInt(ageStr);
        author.setName(name);
        author.setSurname(surname);
        author.setAge(age);
        author.setGender(gender);

    }private static void changeBookAuthor(){
        System.out.println("please input books title");
        String title = scanner.nextLine();
        Book book= bookStorage.getByTitle(title);
        if (book==null) {
            System.out.println("book withthis name doesn't exists.");
            return;
        }System.out.println("please input authors email ");
        String email= scanner.nextLine();
       Author author= authorStorage.getByEmail(email);
       if (author==null){
           System.out.println("author with this email doesn't exists.");
           return;
       }
        book.setAuthor(author);

    }

}

