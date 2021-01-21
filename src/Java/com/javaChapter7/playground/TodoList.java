package Java.com.javaChapter7.playground;

import java.util.Arrays;
import java.util.Scanner;

public class TodoList {

//   ========== Add list ========
    public String[] addItemToTodo(int index){
        String [] todoList = new String[index];
        for(int count = 0; count < todoList.length; count++){

            Scanner userInput = new Scanner(System.in);
            System.out.print("Enter todo" + count + " : ");
            String input = userInput.nextLine();

            todoList[count] = input;
        }
        return todoList;
    }

    public String[] removeItemInArray(String[] arr, int index){
        if(arr == null || index < 0 || index >= arr.length)
            return arr;

        String [] newArray = new String[arr.length - 1];
        for(int counter = 0, indexValue = 0; counter < arr.length; counter++){
            if(counter == index){
                continue;
            }
            newArray[indexValue++] = arr[counter];
        }
        return newArray;
    }

//    Remove list
//    Update list
//    Delete item from list

    public static void main(String[] args) {
        TodoList myTodo = new TodoList();

        String[] output = myTodo.addItemToTodo(5);
        System.out.println(Arrays.toString(output));

        System.out.println(Arrays.toString( myTodo.removeItemInArray(output, 2)));

    }
}
