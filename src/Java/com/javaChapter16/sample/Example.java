package Java.com.javaChapter16.sample;

import java.util.*;

public class Example<T> {
    public static void main(String[] args) {
        String [] colors = {"black", "yellow", "green", "blue", "violet", "silver", "gold", "white", "brown", "blue", "gray", "silver" };
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        String [] removeColors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> removeList = new ArrayList<>(Arrays.asList(removeColors));

        System.out.printf("%s%n",list);

        removeColors(list, removeList);

        convertToUpperCaseString(list);


        System.out.printf("%s%n%s", "Reversed List:", reverseList(list));

        System.out.printf("%nList Value%n");
        System.out.println(list);

        System.out.printf("%nDeleting elements 2 to 4...%n");
        removeItems(list, 0, 3);

        System.out.printf("%s", list);


    }

    private static void removeColors(List<String> list, List<String> removeList) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if (removeList.contains(iterator.next())){
                iterator.remove();
            }
        }
    }

    public static void convertToUpperCaseString(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            iterator.set(iterator.next().toUpperCase());
        }
    }

    public static void  removeItems(List<String> list, int start, int end){
        list.subList(start, end).clear();
    }

    public static List<String> reverseList(List<String> list){
        ListIterator<String> iterator = list.listIterator(list.size());
        List<String> reverseList = new ArrayList<>();
        while (iterator.hasPrevious()){
           reverseList.add(iterator.previous());
        }
        return reverseList;
    }
}
