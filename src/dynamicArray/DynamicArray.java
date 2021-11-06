package dynamicArray;

public class DynamicArray {
    private int array[] = new int[10];
    private int size = 0;

    DynamicArray() {
        int size = -1;

    }

    public void add(int value) {
        if (size == 9) {
            System.out.println("extend function");
        } else {
            array[size++] = value;
        }

    }

    private void extend() {
        int oldArray[]= {3,10,15,19,23,43,56,65,87} ;
        int [] newArray= new int [oldArray.length+10];
        for (int i = 0; i < array.length; i++) {
            oldArray[i]=newArray[i];

            }
        }

        public int getByIndex(int index){
            if (index < array.length ) {
                return  array[index];
            } else {
            return -1;
        }
    }
}
