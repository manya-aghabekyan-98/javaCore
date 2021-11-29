package chapter8;

public class FindAreas {
        public static void main(String[] args) {
            Figure f=new Figure(10, 10);
            Rectangle r=new Rectangle(9, 5);
            Trinagle t=new Trinagle(10,8);
            Figure figref;

            figref=r;
            System.out.println("Площад равна"+ figref.area());

            figref=t;
            System.out.println("Площад равна"+ figref.area());

            figref=f;
            System.out.println("Площад равна"+ figref.area());
        }
}
