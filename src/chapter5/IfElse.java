package chapter5;

public class IfElse {
    public static void main(String[] args) {
        int month =4;
        String season;
        if (month==12)
            season= "земле";
        else if (month==3)
            season ="весне";
        else if (month==6)
            season="лету";
        else if (month==9)
            season= "осени";
        else
            season="вымышленным месяцам";
        System.out.println("Апрель относится к"+ season+".");
    }
}
