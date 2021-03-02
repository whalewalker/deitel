package Java.com.javaChapter9.Interface;

public class BoxedItem implements Sellable, Transportable{
    private String description;
    private int price;
    private int weight;
    private boolean isHazardous;
    private int height;
    private int width;
    private int depth;


    public BoxedItem(String description, int price, int weight, boolean hazardous) {
        this.description = description;
        this.price = price;
        this.weight = weight;
        this.isHazardous = hazardous;
        height = 0;
        width = 0;
        depth = 0;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public int listPrice() {
        return price;
    }

    @Override
    public int lowestPrice() {
        return price / 2;
    }

    @Override
    public int weight() {
        return weight;
    }

    @Override
    public boolean isHazardous() {
        return isHazardous;
    }

    public int insuredValue(){
        return price * 2;
    }

    public void setBox(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth  = depth;
    }
}
