package chapter8;

public class BoxDemo {
    public static void main(String[] args) {
        BoxWeigth mybox1=new BoxWeigth(10, 20, 15, 34.3);
        BoxWeigth mybox2=new BoxWeigth(2, 3, 4, 0.076);
        double vol;

        vol=mybox1.volume();
        System.out.println("Объем mybox1 равен"+vol);
        System.out.println("Вес mybox1 равен"+mybox1.weigth);
        System.out.println();

        vol=mybox2.volume();
        System.out.println("Объем mybox1 равен"+vol);
        System.out.println("Вес mybox1 равен"+mybox1.weigth);
    }
}
