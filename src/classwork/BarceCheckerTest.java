package classwork;

public class BarceCheckerTest {
    public static void main(String[] args) {
        String text = "Hello (from) [Java}";
        BraceChecker braceChecker = new BraceChecker();
        braceChecker.check();
        System.out.println("Error: opened [ but closed } at 20");
    }
}
