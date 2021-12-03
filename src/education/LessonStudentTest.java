package education;

import author1.util.DateUtil;
import education.model.Lesson;
import education.model.Student;
import education.storage.LessonStorage;
import education.storage.StudentStorage;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class LessonStudentTest implements LessonStudentCommands {
    static Scanner scanner = new Scanner(System.in);
    static LessonStorage lessonStorage = new LessonStorage();
    static StudentStorage studentStorage = new StudentStorage();





    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
           LessonStudentCommands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                case ADD_LESSON:
                    addLesson();
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
                case ADD_STUDENT:
                  addStudent();
                    break;
                default:
                    System.out.println("Invalid command!");
            }
        }
    }

    private static void addStudent() throws ParseException {
        System.out.println("please input student's name, surname, age, email, phone, lesson, registeredData[01/04/2001]");
        String studentDataStr = scanner.nextLine();
        String[] studentData = studentDataStr.split(",");
        if (studentDataStr.length() == 7) {
            int age = Integer.parseInt(studentData[2]);
            Date date= DateUtil.stringToDate(studentData[6]);
            Student student = new Student(studentData[0], studentData[1],  age, studentData[3], studentData[4],
                    studentData[5],studentData[6]);
            if (studentStorage.getByEmail(student.getName()) != null) {
                System.err.println("Invalid email.Student with this email already exists");
            } else {
                studentStorage.add(student);
                System.out.println("Thank you,student added");
            }
        } else {
            System.err.println("invalid data");


        }
    }


        private static void deleteStudentByEmail () {
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


        private static void deleteLessonByName () {
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

