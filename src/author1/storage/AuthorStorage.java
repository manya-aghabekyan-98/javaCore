package author1.storage;

import author1.model.Author;

public class AuthorStorage {
    public Author[] authors = new Author[16];
    public int size;

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
            if (authors[i].getName().contains(keyword) ||
                    authors[i].getSurname().contains(keyword)) {
                System.out.println(authors[i]);
            }
        }
    }

    public void searchByAge(int minAge, int maxAge) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getAge() >= minAge &&
                    authors[i].getAge() <= maxAge) {
                System.out.println(authors[i]);
            }
        }
    }

    public Author getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                return authors[i];
            }
        }
        return null;
    }


    public void deleteByAuthor(String email) {
        for (int i = 0; i < size; i++) {
            if (authors[i].getEmail().equals(email)) {
                size--;
            }
        }
    }

    public void delete(Author author) {
        for (int i = 0; i < size; i++) {
            if (authors[i].equals(author)) {
                deleteByIndex(i);
            }
            break;

        }
    }



    private void deleteByIndex(int index) {
            for (int i = index+1; i <size ; i++) {
                authors[i-1]=authors[i];
                    size--;
                }

            }

        }




