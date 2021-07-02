package Java.com.javaChapter16.sample;

import java.util.*;

public class Example<T> {

    public void removeColors(Collection<T> collection1, Collection<T> collection2){
        Iterator<T> iterator = collection1.iterator();

        while (iterator.hasNext()){
            if (collection2.contains(iterator.hasNext()))
                iterator.remove();
        }
    }

    public void addColor(Collection<T> collection){
        for (T color : collection){
            collection.add(color);
            System.out.printf("%s ", color);
        }
    }

    private void printList(Collection<T> list){
        System.out.printf("%nList%n:");
        for (T color : list)
            System.out.println(color);
    }

    private static void convertToUpperCaseString(List<String> list){
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toLowerCase());
        }
    }

    private void removeItem(List<T> list, int start, int end){
        list.subList(start, end).clear();
    }

    private void printReversedLink(List<T> list){
        ListIterator<T> iterator = list.listIterator(list.size());
        System.out.printf("%nReversed List:%n");

        while (iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
     }

     private void addList(Collection<T> list){
        for(T color : list)
            list.add(color);
     }

    public static <integer> void main(String[] args) {
//        String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
//        Example<String> list1 = new Example<>();
//
//        list1.addList(Arrays.asList(colors));
//
//        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
//        Example<String> list2 = new Example<>();
//
//        list1.addList(Arrays.asList(colors2));

//        list2 = null; // release resources
//        list1.printList((Collection<String>) list1); // print list1 elements
//        list1.co // convert to uppercase string
//        printList(list1); // print list1 elements



        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(8);

//        List<Integer> list2 = list;
//        System.out.println("first loop");
//        list2.forEach(System.out::println);
//
//        for (int count = 0; count < list.size(); count++){
//            System.out.println(list.get(count));
//            if (1 == list.get(count))
//                list.remove(count);
//        }
//        System.out.println("removing...");
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()){
//            int val = iterator.next();
////            System.out.println(list);
//            if(1 == val)
//                iterator.remove();
//        }
//        System.out.println("second print");
//        list.forEach(System.out::println);


    }


}
