package Java.com.javaChapter9.stack;

import java.math.BigDecimal;

public class Stack {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public Stack(){
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity){
        elements = new int[capacity];
    }

    public void push(int value){
        if(size >= elements.length){
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop(){
        return elements[--size];
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int count = 0; count < 6; count++){
            stack.push(count);

            while (!stack.empty()){
                System.out.print(stack.pop() + " ");
            }
        }

        System.out.println(Integer.parseInt("10"));
        System.out.println(Integer.parseInt("10", 10));
        System.out.println(Integer.parseInt("10", 16));
        System.out.println(Integer.parseInt("11"));
        System.out.println(Integer.parseInt("11", 10));
        System.out.println(Integer.parseInt("11", 16));

        int[] arr = {3, 4, 5, 6, 7, 78,89 };
        int[] desc = new int[arr.length - 1];
            System.arraycopy(arr, 1, desc, 0, arr.length - 1);
           arr = desc;


        for(int count : arr){
            System.out.println(count);
        }
    }
}
