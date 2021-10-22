package arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {5, 12, 23, 37, 41, 56, 64, 79, 85, 99};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];


            }
            System.out.println("max=" + max);


        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[0] > min) {
                min = array[0];
            }
            System.out.println("min=" + min);

        }System.out.println("print all events");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + "");

            }
            System.out.println();
            System.out.println("print all odds");
            for (int j = 0; j < array.length; j++) {
                if (array[i] % 2 != 0) {
                    System.out.println(array[i] + "");
                }
                System.out.println();
                int evenCount = 0;
                for (int k = 0; k < array.length; k++) {
                    if (array[i] % 2 == 0) {
                        evenCount++;
                    }
                    System.out.println("count of even:"+ evenCount);
                }


            }


        }}   }