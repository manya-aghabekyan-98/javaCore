package homework4.figurePainter;

public class FigurePainter {
    void figureOne(int n, char c) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c+" ");

            }
            System.out.println();

        }

        }void  figureTwo(int n,char b){
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print(b+" ");

            }
            System.out.println();
        }
            }void figureThree(int n, char a){
        for (int i = 4; i >0; i--) {
            for (int j = i; j>0; j--) {
                System.out.print(a+" ");

            }
            System.out.println();

        }
        }void figureFore(int n, char d){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j >i; j--) {
                System.out.print(d+" ");
            }
            System.out.println();
        }

    }void  figureFive(int n,char e){
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 4; i >0; i--) {
            for (int j = i; j>0; j--) {
                System.out.print("* ");

            }
            System.out.println();


        }

        }
    }




