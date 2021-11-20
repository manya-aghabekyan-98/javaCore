package author;

public class AuthorStorage1 {
    private Author[] authors = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (authors.length == size) {
            extend();

        }
        authors[size++] = author;

    }

    private void extend() {
        Author[] tmp = new Author[authors.length + 10];
        System.arraycopy(authors, 0, tmp, 0, authors.length);
        authors = tmp;


    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(authors[i]);
        }
    }

    public void searchByName(String keyword) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getName().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }

        }
    public static void searchByAge(int minAge, int maxAge){
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge()>minAge && authors[i].getAge()<maxAge){
                System.out.println(authors[i]);
            }

        }
    }
}
