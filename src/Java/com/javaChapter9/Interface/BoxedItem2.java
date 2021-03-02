package Java.com.javaChapter9.Interface;

public class BoxedItem2 extends BoxedItem implements Insurable{
    public BoxedItem2(String description, int price, int weight, boolean hazardous) {
        super(description, price, weight, hazardous);
    }
}
