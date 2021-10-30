package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox =new Box();
        double vol;

        mybox.height=20;
        mybox.width=10;
        mybox.depth=15;

        vol= mybox.depth * mybox.width * mybox.height;
        System.out.println("vol"+vol);
    }
}
