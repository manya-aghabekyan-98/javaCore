package chapter8;

public class A1 {
    A1 (){
        System.out.println("B конструкторе A");
    }
}class B1 extends A1 {
    B1 (){
        System.out.println("B конструкторе B");
    }
}class C extends B1{
    C (){
        System.out.println("B конструкторе C");
    }
}
