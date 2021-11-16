package author;

public class Author {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String gender;

    private Author(String name, String surname, int age, String email, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.gender = gender;
    } Author author = new Author ("Armen", "Poxosyan", 12,
            "armen-poxosyan12", "arakan");

    public String getName() {
        return name;

    }public String getSurname(){
        return surname;

    }public  int getAge(){
        return age;
    }public  String getEmail(){
        return email;
    }public String getGender(){
        return  gender;

    }
}






