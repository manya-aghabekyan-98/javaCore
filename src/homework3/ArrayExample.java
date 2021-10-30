package homework3;

public class ArrayExample {
    public static void main(String[] args) {
    int[] array={3,5,6,7,6,8,9,10,9,11};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]) {

                }System.out.println(array[i] +"-ը կրկնվում է");
                break;

        }int[] array1 = {3,5,6,7,9,12,34,56,63,88 };
            boolean result=true;
            for (int j = 0; j < array1.length; j++) {
                if (array[i]%2 !=0){
                     result=false;
                     break;
                }System.out.println(result);
            }

            }

    }
}
