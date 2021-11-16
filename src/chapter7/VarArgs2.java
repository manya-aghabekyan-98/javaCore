package chapter7;

public class VarArgs2 {

    static  void  vaTest(String msg,int...v){
        System.out.println("Количество аргументов"+ v.length+"Содержимое");
        for (int x: v){
            System.out.println(x+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        vaTest("Один параметр переменщй длиный", 10);
        vaTest("два параметра переменщй длиный",1, 2, 3 );
        vaTest("БЕЗ параметрОВ переменщй длиный" );
    }
}
