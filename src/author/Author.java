package author;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    private String email;
    private String gender;
    private int age;

    private Author(String name, String surname, String email, String gender, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age && Objects.equals(name, author.name) && Objects.equals(surname, author.surname) && Objects.equals(email, author.email) && Objects.equals(gender, author.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email, gender, age);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}









