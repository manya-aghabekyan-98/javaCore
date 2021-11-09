package chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        Box1 myclone=new Box1(mybox1);
    double vol;

    vol=mybox1.volume();
        System.out.println("Объем mybox1 равем"+vol);

    vol=mybox2.volume();
        System.out.println("Объем mybox2 равем"+vol);

    vol=mycube.volume();
        System.out.println("Объем mycube равем"+vol);

    vol=myclone.volume();
        System.out.println("Объем myclone равем"+vol);

}}
