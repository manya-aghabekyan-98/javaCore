package chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box2 mybox1= new Box2();
        Box2  mybox2=new Box2();
        double vol;
        mybox1.setDim(10,20,15);
        mybox2.setDim(3,6, 9);
        vol=mybox1.volume();
        System.out.println("Объем равен"+vol);
        vol=mybox2.volume();
        System.out.println("Объем равен"+vol);

}
}
