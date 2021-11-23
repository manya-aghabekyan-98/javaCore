package chapter8;

public class Box1 {
    private double width;
    private double height;
    private double depth;

    Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}class  BoxWeight extends Box {
    double weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        weight=ob.weight;

    }BoxWeight(double w,double h, double d, double m){
        super(w, h, d);
        weight=m;


    }BoxWeight(){
        super();
        weight=-1;
    }BoxWeight(double len, double m){
        super(len);
        weight=m;


    }




}
