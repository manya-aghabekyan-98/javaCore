package dynamicArray;

public class DynamicArrayTest {
    public static void main(String[] args) {
        DynamicArray da=new DynamicArray();
        for (int i=0;i<10;i++){
            da.add(i);
        }for (int i=10;i<20;i++){
            da.add(i);
        }System.out.println(da.getByIndex(8));

    }
}
