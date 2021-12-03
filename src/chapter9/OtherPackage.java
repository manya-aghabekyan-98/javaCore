package chapter9;

public class OtherPackage {
    OtherPackage(){
        Protection p=new Protection();
        System.out.println("конструктор из другого пакета");
        System.out.println("n_pub="+ p.n_pub);
    }
}
