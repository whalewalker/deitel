package Java.com.javaChapter3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    Invoice invoice;

    @BeforeEach
    public void setup() {
        invoice = new Invoice("Shovel", 2, 1000);
    }

    @Test
    @DisplayName("calculate amount after initialization")
    void getInvoiceAmountWhenPriceIsPositive() {
        assertEquals(2000, invoice.getInvoiceAmount());
        assertEquals(1, invoice.getInvoiceNumber());
    }


    @Test
    @DisplayName("Invoice amount return zeron when price is less than or equal to zero")
    void getInvoiceAmountWhenPriceIsNegative(){
        invoice.setPrice(-300);
        assertEquals(0.0, invoice.getInvoiceAmount());
        assertEquals(1, invoice.getInvoiceNumber());
    }

 }