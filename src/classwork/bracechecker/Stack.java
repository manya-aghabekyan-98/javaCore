package classwork.bracechecker;

public class Stack {
    int stack[]=new int[10];
    int size;
    Stack(){
        size=-1;


    }void push(int item){
        if(size==9)
            System.out.println("Стек заполнен");
        else
            stack[++size]=item;

    }int pop(){
        if (size<0){
            System.out.println("Стек  не загржен");
            return 0;
        }else
            return stack[size--];
}
}
