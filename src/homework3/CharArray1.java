package homework3;

public class CharArray1 {

    public static void main(String[] args) {
        char[] array = {'f','l','y'};
            if (array[array.length-1]=='l' && array[array.length-2]=='y'){
                System.out.println(true);
            }else {
                System.out.println(false);
            }char[] array1 ={'b','a','b','o','l','a'};
            boolean bob= false;
        for (int i = 0; i < array1.length-2; i++){
            if (array1[i]=='b'&& array1[i+2]=='b'){
                bob=true;
                break;
            }System.out.println(bob);
            
        }char[] text={' ',' ','h','e','l','l','o',' ',' '};
        int startIndex=0;
        int endIndex= text.length-1;
        while (startIndex < endIndex && text[startIndex]==' '){
            startIndex++;
        }while (startIndex < endIndex && text[endIndex]==' '){
            endIndex--;
        }char[] result= new char[(endIndex-startIndex)+1];
        int index=0;
        for (int i = startIndex; i <=endIndex ; i++) {
            result[index++]=text[i];
            for (int j = 0; j < result.length; j++){
            }System.out.println(result[i]);


        }int[] array2={3,6,8,5,9,8,11,19,45,58};
        for (int i = 0; i <array.length ; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array2[j]<array2[j-1]){
                    int tmp= array2[j];
                    array2[j]= array2[j-1];
                    array2[j-1]=tmp;
                    for (int k = 0; k < array2.length; k++) {

                    }
                }System.out.println(array2[i]+"");

            }

        }

        }
    }






