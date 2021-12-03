package chapter9;

public class Derived extends Protection {
    Derived() {
        System.out.println("конструктор подклфсса");
        System.out.println("n="+n);

        System.out.println("n_pro="+n_pro);
        System.out.println("n_pub="+n_pub);
    }
}
