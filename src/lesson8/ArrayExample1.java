package lesson8;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] array={3,5,6,2,10,9,43,55,67,78};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if (array[j]< array[j-1]){
                    int tmp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=tmp;
                }

            }




        }
    }
}
