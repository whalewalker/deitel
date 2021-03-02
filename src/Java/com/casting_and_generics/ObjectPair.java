package Java.com.casting_and_generics;

public class ObjectPair {
    Object first;
    Object second;

    public ObjectPair(Object first, Object second){
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

    public static void main(String[] args) {
        ObjectPair pair = new ObjectPair("ORCL", 2334);

        String stcok = (String) pair.getFirst();
    }
}
