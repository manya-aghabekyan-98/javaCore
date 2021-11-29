package chapter8;

abstract class A2 {
    abstract void callme();

    void callmetoo(){
        System.out.println("Ето конкретный метод");

    }
}class B2 extends A2{
    void callme(){
        System.out.println("Реалиэация метода callme в клласе B ");
    }
}
