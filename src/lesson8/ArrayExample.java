package lesson8;

public class ArrayExample {
    public static void main(String[] args) {
        int[]array={3,6,9,7,21,43,76,78,98,99};
        int n =7;
        int index =-1;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]==n){
                index=i;

            }System.out.println(index);

        }
    }
}
