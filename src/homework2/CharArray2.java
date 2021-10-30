package homework2;

public class CharArray2 {
    public static void main(String[] args) {
        char[] charArray= {'b','o','l','o','l','a'};
        int count=0;
        char c ='o';
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]==c){
                count++;


            }
            System.out.println("count of"+c+"="+count);

        }char[] charArray1= {'b','o','l','o','l','a'};
        System.out.print(charArray1[charArray1.length/2]);
        System.out.print(charArray1[charArray1.length/2+1]);

}




}
