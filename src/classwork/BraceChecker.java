package classwork;

import classwork.bracechecker.Stack;

public class BraceChecker {
    // Սա հենց տեքստն է
    private String text;


    // կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    // Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    BraceChecker(String text) {
        this.text = text;
    }


    // սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե Stack-ի հետ, թե վերևի text-ի
    public boolean check() {
        Stack stack = new Stack();
        char ch;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '{':
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case '}':
                    ch = stack.pop();
                    if (ch != '{') {
                        return false;
                    }
                    break;
                case ')':
                    ch = stack.pop();
                    if (ch != '(') {
                        return false;
                    }
                    break;
                case ']':
                    ch = stack.pop();
                    if (ch != '[') {
                        return false;
                    }
                    break;
            }

        }
        if(stack.size!=0){
            return false;
        }
        return true;
    }
}




