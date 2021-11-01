package chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box3 mybox1=new Box3();
        Box3 mybox2=new Box3();
        double vol;
        vol=mybox1.volume();
        System.out.println("vol"+vol);
        vol=mybox2.volume();
        System.out.println("vol"+vol);


    }
}
