package lesson10;

public class Student {
   private String name;
    private String surname;
   private int age;
    private String phoneNumber;
   private String lessonName;

    public Student(String name, String surname, int age, String phoneNumber, String lessonName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.lessonName = lessonName;
    }
    public String getName(){
        return name;
    }

}

