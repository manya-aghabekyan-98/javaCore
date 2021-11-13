package dynamicArray1;

public class DynamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (array.length == size) {
            extend();

        }
        array[size++] = value;




    }public void  set (int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        } else {
            array[index] = value;
        }
    }

    private void extend() {
        int[] tmp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];

        }
        array = tmp;
    }

    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
            return -1;
        }
        return array[index];


    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);

        }
    }

    void delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        } else {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            size--;

        }

    }

    public boolean isEmty() {
        return size == 0;


    }

    public boolean isExists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] ==value ) {
                return true;


            }

        }return  false;
    }
}





