package homework;

public class Array2 {
    public static void main(String[] args) {
        int[] array={8,13,24,31,47,52,67,78,84,98};
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==0){
                array[i]=i+1;
                System.out.println(array[i]);

            }
            int[]array1={8,13,24,31,47,52,67,78,84,98};
            for (int j = 0; j < array1.length; j++) {
                if (array[i]%2==1){
                    array1[i]=i+1;
                    System.out.println(array1[i]);
                }

            }

        }
    }
}
