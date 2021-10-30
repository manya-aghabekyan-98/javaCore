package homework4.arrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 5, 8, 14, 16, 34, 45, 57, 64, 89};
        int arrayMax = arrayUtil.max(array);
            System.out.println( arrayMax);
            int arrayMin = arrayUtil.min(array);
                System.out.println(arrayMin);
                ArrayUtil arrayUtil1=new ArrayUtil();
                int arrayEvens= arrayUtil1.evens(array);
                    System.out.println(arrayEvens);
                    ArrayUtil arrayUtil2 =new ArrayUtil();
                    int arrayOdd= arrayUtil2.odd(array);
                        System.out.println(arrayOdd);
                        ArrayUtil arrayUtil3=new ArrayUtil();
                        int arrayEvent=arrayUtil3.Event(array);
                        System.out.println(arrayEvent);
                        ArrayUtil arrayUtil4=new ArrayUtil();
                        int oddCount=arrayUtil4.oddCount(array);
                        System.out.println(oddCount);



                    }
                    }








