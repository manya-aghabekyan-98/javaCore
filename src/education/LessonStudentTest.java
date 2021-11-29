package education;

import author1.Author;

import java.util.Scanner;

public class LessonStudentTest {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();

    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";



    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                case ADD_LESSON:
                    addLesson();
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_STUDENTS:
                    printStudents();
                    break;
                case PRINT_LESSONS:
                    printLesson();
                    break;
                case DELETE_LESSON_BY_NAME:
                    deleteLessonByName();
                    break;
                case DELETE_STUDENT_BY_EMAIL:
                    deleteStudentByEmail();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }



  private static void printCommands() {
        System.out.println("\u001B[34m" + "please input " + EXIT + " for EXIT");
        System.out.println("please input " + ADD_LESSON + " for add lesson");
        System.out.println("please input " + ADD_STUDENT + " for add student");
        System.out.println("please input " + PRINT_STUDENTS + " for print students");
        System.out.println("please input " + PRINT_STUDENTS_BY_LESSON + " for print students by lesson");
        System.out.println("please input " + PRINT_LESSONS + " for print Lessons");
        System.out.println("please input " + DELETE_LESSON_BY_NAME + " for delete lesson by name");
        System.out.println("please input " + DELETE_STUDENT_BY_EMAIL + " for delete student by email");
    }


    private static void deleteStudentByEmail() {
        System.out.println("please choose student email");
        System.out.println("--------");
        lessonStorage.print();
        System.out.println("--------");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            studentStorage.deleteByStudent(student);
        } else {
            System.err.println("Author does not exists");
        }
    }

    private static void deleteLessonByName() {
        System.out.println("please choose lesson name");
        System.out.println("--------");
        lessonStorage.print();
        System.out.println("--------");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.deleteByLesson(lesson);
        } else {
            System.err.println("Author does not exists");

        }
    }


    private static void printLesson() {
        lessonStorage.print();
    }

    private static void printStudents() {
        studentStorage.print();
    }

    private static void addStudent() {
        System.out.println("please input students name, surname, age, email, phone, lesson");
        String studenDataStr= scanner.nextLine();
        String[] studentData =studenDataStr.split(",");
        if (studentData.length == 6) {
           int age = Integer.parseInt(studentData[2]);
            Student student = new Student(studentData[0], studentData[1], age,studentData[3],
                    studentData[4],studentData[5]);
            if (studentStorage.getByEmail(student.getEmail()) != null) {
                System.err.println("Invalid email. Student with this email already exists");
            } else {
                studentStorage.add(student);
                System.out.println("Thank you, student was added");
            }
        } else {
            System.err.println("invalid data");

    }
    }

    private static void addLesson() {
        System.out.println("please input lesson's name,duration,lecturerName, price");
        String lessonDataStr = scanner.nextLine();
        String[] lessonData = lessonDataStr.split(",");
        if (lessonData.length == 4) {
            double price = Double.parseDouble(lessonData[3]);
            Lesson lesson = new Lesson(lessonData[0], lessonData[1], lessonData[2], price);
            if (lessonStorage.getByName(lesson.getName()) != null) {
                System.err.println("Invalid email. Lesson with this name  already exists");
            } else {
                lessonStorage.add(lesson);
                System.out.println("Thank you, lesson  added");
            }
        } else {
            System.err.println("invalid data");


        }
    }
}

