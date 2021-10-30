package homework4.arrayUtil;

public class ArrayUtil {
    int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];


            }
        }
        return max;


    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }return min;


    } int evens(int[]array) {
        int evens = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evens=array[i];




            }

        }return evens;



    }  int odd (int[]array) {
        int odd = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd=array[i];


            }

        }return odd;

    }int Event (int[]array) {
        int Event = array[0];
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }return Event;
    }int oddCount(int[]array) {
        int oddCount = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }return oddCount;

    }

    }
