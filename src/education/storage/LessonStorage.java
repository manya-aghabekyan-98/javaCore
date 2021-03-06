package education.storage;

import education.model.Lesson;

public class LessonStorage {
    public Lesson[] lessons = new Lesson[10];
    public int size;

    public void add(Lesson lesson) {
        if (lessons.length == size) {
            extend();
        }
        lessons[size++] = lesson;
    }

    private void extend() {
        Lesson[] tmp = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0, tmp, 0, lessons.length);
        lessons = tmp;

    }

    public void  print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);

        }

    }

    public Lesson getByName(String name) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(name)){
                return lessons[i];
            }

        }return null;
    }

    public void deleteByLesson(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getName().equals(lesson)){
                deleteByIndex(i);
                break;
            }

        }
    }

    private void deleteByIndex(int index) {
        for (int i = index+1; i < size; i++) {
            lessons[i-1]=lessons[i];
            size--;
        }
    }
}

