public class Array {

    public static void main(String[] args) {
        char[] array= {'h','e','l','l','o'};
        int count =0;
        char c='l';
        for (int i = 0; i < array.length; i++)
        if (array[i]==c){
            count++;
        }System.out.println("count of "+c+'='+count);
    }


}
