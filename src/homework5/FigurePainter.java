package homework5;

public class FigurePainter {
    public static void main(String[] args) {
        int k= 5;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < k -1-i; j++) {
                System.out.print(" *");

            }System.out.println();


        }
    }
}
