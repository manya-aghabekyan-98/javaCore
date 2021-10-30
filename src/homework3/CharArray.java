package homework3;

public class CharArray {

    public static void main(String[] args) {
        char[] array1 ={'b','a','b','o','l','a'};
        boolean bob= false;
        for (int i = 0; i < array1.length-2; i++){
            if (array1[i]=='b'&& array1[i+2]=='b'){
                bob=true;
                break;
            }System.out.println(bob);


    }













}}
