package homework4.figurePainter;

public class FigurePainterTest {

    public static void main(String[] args) {
        FigurePainter fp=new FigurePainter();
        fp.figureOne(8,'*');
        fp.figureOne(12,'.');
        FigurePainter fp1 =new FigurePainter();
        fp1.figureTwo(9,'/');
        fp1.figureTwo(17,'-');
        FigurePainter fp2=new FigurePainter();
        fp2.figureThree(23,'[');
        fp2.figureThree(35,'-');
        FigurePainter fp3=new FigurePainter();
        fp3.figureFore(17,')');
        fp3.figureFore(41,'(');
        FigurePainter fp4=new FigurePainter();
        fp4.figureFive(9,'*');
        fp4.figureFive(14,'>');



}}


