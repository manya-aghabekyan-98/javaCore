package chapter9;

public class Protection2 extends Protection {
    Protection2(){
        System.out.println("конструкторб унаследованный из другого пакета");
        System.out.println("n_pro="+n_pro);
        System.out.println("n_pub="+n_pub);
    }

}
