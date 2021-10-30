package homework3;

public class CharArray2 {
    public static void main(String[] args) {
        int[] array={3,6,4,7,13,10,19,24,36,38};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j<array.length ; j++) {
                if (array[j] > array[j-1]){
                    int tmp =array[j];
                    array[j]=array[j-1];
                    array[j-1]=tmp;
                    for (int k = 0; k < array.length; k++) {

                    }System.out.println(array[i]+" ");

                }

            }

        }
    }


}
