package Java.com.javaChapter3;

public class Invoice {
    private static Integer invoiceNumber = 0;
    private String description;
    private int quantity;
    private double price;

    public Invoice( String description, int quantity, double price) {
        invoiceNumber++;
        this.description = description;
        if(isValidPrice(quantity)) this.quantity = quantity;
        if (isValidPrice(price)) this.price = price;
    }

    public Invoice( String description, double price){
        this.quantity = 1;
        invoiceNumber++;
        this.description = description;
        if (isValidPrice(price)) this.price = price;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity)  {
        if(isValidPrice(quantity)) this.quantity = quantity;
        this.quantity = 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        if (isValidPrice(price)){
            this.price = price;
        }

        this.price = 0.0;
    }

    private boolean isValidPrice(double price) {
        return price > 0;
    }

    public double getInvoiceAmount() {
        if (isValidPrice(getPrice())){
            return price * quantity;
        }
        return 0.0;
    }
}
