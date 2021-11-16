package author;

public class AuthorStorage {
    private Author[] array = new Author[10];
    private int size = 0;

    public void add(Author author) {
        if (array.length == size) {
            extend();

        }
        array[size++] = author;

    }

    private void extend() {
        Author[] newArray = new Author[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];


        }
    }

    public Author getByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
            return array[index];
        }return null;

        }


     public  void print () {
            for (int i = 0; i < size; i++) {
                System.out.println(array[i]);
            }
        }
    }


