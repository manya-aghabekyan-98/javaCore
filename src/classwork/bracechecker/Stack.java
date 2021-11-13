package classwork.bracechecker;

public class Stack {
     char stack[]=new char[10];
    public int size;
   public Stack(){
        size=0;


    }public void push(char item){
        if(size==9)
            System.out.println("Стек заполнен");
        else
            stack[size++]=item;

    }public char pop(){
        if (size<1){
            System.out.println("Стек  не загржен");
            return 0;
        }else
            return stack[--size];
}
}
