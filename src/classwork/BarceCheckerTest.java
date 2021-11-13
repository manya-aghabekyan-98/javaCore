package classwork;

public class BarceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello (from) [Java";
        String text1 = "[Hello (from} ]Java";
        BraceChecker braceChecker = new BraceChecker(text1);
        braceChecker.check();
        System.out.println(braceChecker.check());
    }
}
