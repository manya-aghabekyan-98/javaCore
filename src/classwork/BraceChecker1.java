package classwork;

import static jdk.nashorn.internal.objects.NativeArray.push;

public class BraceChecker1 {
    private String text;

    BraceChecker1(String text){
        this.text=text;
    }
    public void  check(){
        for (int i = 0; i < text.length(); i++) {
            char c=text.charAt(i);
            switch (c){

                case '(':
                case '{':
                case '[':

                    break;
                case ')':

            }

        }
    }
}
