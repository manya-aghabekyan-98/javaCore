package chapter8;

abstract class Figure1 {
    double dim1;
    double dim2;

    Figure1(double a, double b) {
        dim1 = a;
        dim2 = b;

    }

    abstract double area();

}
class Rectangle extends Figure1 {
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("в области четырехугольника");
        return dim1*dim2;
    }
}class Trinagle extends Figure1 {
    Trinagle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("в области четырехугольника");
        return dim1*dim2/2;
    }
}
