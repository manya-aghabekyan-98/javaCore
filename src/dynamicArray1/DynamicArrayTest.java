package dynamicArray1;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray dy=new DynamicArray();
        for (int i = 0; i < 10; i++) {
            dy.add(i +1);

        }  System.out.println(dy.getByIndex(3));
        dy.print();
        dy.delete(4);
        dy.print();
        System.out.println(dy.isEmty());

    }



}
