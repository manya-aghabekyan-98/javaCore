package chapter7;

public class PassObjRe {
    public static void main(String[] args) {
        Test2 ob= new Test2(15,20);
        System.out.println("ob.a и ob.b до вызова:"+ob.a+""+ob.b);
        System.out.println("ob.a и ob.b после вызова:"+ob.a+""+ob.b);
    }
}
