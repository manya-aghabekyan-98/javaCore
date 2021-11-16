package chapter7;

public class Stack1 {

    private int stack[];
    private int tos;

    Stack1(int size){
        stack=new int[size];
        tos=-1;
    }
    void push(int item){
        if (tos==stack.length-1){
            System.out.println("Стек заполнен");

        }else {
            stack[++tos] = item;
        }


                }
        int  pop(){
            if (tos<0){
                System.out.println("Стек не загружен");
                return 0;


            }else {
                return stack[tos--];
            }
            }
        }

            class TestStack2{
                public static void main(String[] args) {
                    Stack myStack1=new Stack();
                    Stack myStack2=new Stack();
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 8; j++) {
                            System.out.println("Стек к mystack1");
                            for (int k = 0; k < 5; k++) {
                                System.out.println(myStack1.pop());

                                System.out.println("Стек к mystack2");
                                for (int l = 0; l < 8; l++) {
                                    System.out.println(myStack2.pop());
                                }
                            }
                        }

                    }
                }
            }

