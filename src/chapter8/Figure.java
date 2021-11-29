package chapter8;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Площадь фигуры не определена");
        return 0;
    }

    class Rectangle extends Figure {
        Rectangle(double a, double b) {
            super(a, b);
        }

        double area() {
            System.out.println("в области четырехугольника");
            return dim1 * dim2;
        }

    }

    class Trinagle extends Figure {
        Trinagle(double a, double b) {
            super(a, b);
        }

        double area() {
            System.out.println("в области четырехугольника");
            return dim1 * dim2 / 2;
        }
    }
}






