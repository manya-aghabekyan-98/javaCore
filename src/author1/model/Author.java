package author1.model;

import java.util.Date;
import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String gender;
    private Date dateofBirth;

    public Author(String name, String surname, int age, String email, String gender, Date dateofBirth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.dateofBirth = dateofBirth;
    }



    public Author() {
    }

    public Author(String authorDatum, String authorDatum1, String authorDatum2, String authorDatum3, int age, String authorDatum4) {
    }


    public Date getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(Date dateofBirth) {
        this.dateofBirth = dateofBirth;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age && Objects.equals(name, author.name) && Objects.equals(surname, author.surname) && Objects.equals(email, author.email) && Objects.equals(gender, author.gender) && Objects.equals(dateofBirth, author.dateofBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, email, gender, dateofBirth);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", dateofBirth=" + dateofBirth +
                '}';
    }
}




