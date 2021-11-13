package homework6;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {3, 7, 12, 24, 37, 43, 56, 62, 74, 86};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "");

        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];


            }
            System.out.print("max=" + max);
        }
        System.out.println();
       int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min= array[i];

        }
            System.out.print("min="+min);
            System.out.println();
            }
        System.out.println("print all events");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                System.out.print(array[i]+"");


        }
            System.out.println();

        }int evenCount=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                evenCount++;
            }
            System.out.print("even of count"+evenCount);

        }
        System.out.println();
        int odds=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 !=0){

        }
            System.out.println("print all odds");
    }
        System.out.println();
        int oddCount=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0){
                oddCount++;
            }
            System.out.println("count of odd"+oddCount);
        }
        System.out.println();
            int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array.length;
            System.out.println("sum"+sum);
            System.out.println("avg:"+sum/array.length);
        }
        }


    }


