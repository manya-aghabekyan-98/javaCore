package chapter7;

public class StringDemo2 {
    public static void main(String[] args) {
        String strob1="ПЕРВАЯ СТРОКА";
        String strob2="ВТОРАЯ СТРОКА";
        String strob3=strob1;
        System.out.println("Длина строки strob1:"+strob1.length());
        System.out.println("Символ по индексу3"+ "в  строке strob1:"+ strob1.charAt(3));
        if (strob1.equals(strob2)){
            System.out.println("strob1==strob@");
        }else {
            System.out.println("strob1 !=strob2");
            if (strob1.equals(strob2)){
                System.out.println("strob1==strob3");
            }else {
                System.out.println("strob1 !=strob3");
            }
        }
        }

}
