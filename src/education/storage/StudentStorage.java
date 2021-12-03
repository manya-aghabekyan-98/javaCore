package education.storage;

import education.model.Student;

public class StudentStorage {
    public Student[] students = new Student[16];
    public int size;

    public void add(Student student) {
        if (students.length == size) {
            extend();
        }
        students[size++] = student;
    }

    private void extend() {
        Student[] tmp = new Student[students.length + 10];
        System.arraycopy(students, 0, tmp, 0, students.length);
        students = tmp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(students[i]);

        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(email)) {
                return students[i];
            }

        }
        return null;
    }

    public void deleteByStudent(Student student) {
        for (int i = 0; i < size; i++) {
            if (students[i].getEmail().equals(student)) {
                deleteByIndex(i);
                break;
            }


        }
    }

    private void deleteByIndex(int index) {
        for (int i =index+1; i < size; i++) {
            students[i-1]=students[i];
            size--;

        }

    }


    }



