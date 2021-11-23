package chapter8;

public class Box2 {
    private double width;
    private double height;
    private double depth;

    Box2(Box2 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box2(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}class  Box2Weight extends Box {
    double weight;

    Box2Weight(Box2Weight ob){
        super(ob);
        weight=ob.weight;

    }Box2Weight(double w,double h, double d, double m){
        super(w, h, d);
        weight=m;


    }Box2Weight(){
        super();
        weight=-1;
    }Box2Weight(double len, double m){
        super(len);
        weight=m;


    }

}class Shipment extends  Box2Weight{
    double cost;

    Shipment(Shipment ob){
        super(ob);
        cost=ob.cost;



    } Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;

    }
    Shipment(){
        super( );
        cost=-1;

    }Shipment(double len, double m, double c){
        super(len, m);
        cost=c;
    }

}
