package classwork.bracechecker;

public class Stack2 {
    int stack[] = new int[10];
    int tos;

    Stack2() {
        tos = -1;


    }

    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен");
        else
            stack[++tos] = item;

    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек  не загржен");
            return 0;
        } else
            return stack[tos--];
    }
}


