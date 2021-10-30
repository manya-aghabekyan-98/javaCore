package arrayutil;

public class ArrayUtil1 {
    public static void main(String[] args) {
        int[] array = {2, 7, 9, 14, 16, 29, 35, 57, 67, 98};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);


        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];

            }
            System.out.println("min=" + min);

        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            System.out.println("max=" + max);

        }
        System.out.print("print all event");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

            }
            System.out.println(array[i] + "");

        }
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
                System.out.println("count of even" + evenCount);

            }int sum=0;
            for (int j = 0; j < array.length; j++) {
                sum+= array.length;
                System.out.println("sum"+ sum);
                System.out.println("avg"+sum/array.length );

            }

        }


    }}
