package Java.com.javaChapter9.creditCard;

public class CreditCard {
    private String customers;
    private String bank;
    private String account;
    private int limit;
    private int balance;


    public String getCustomers() {
        return customers;
    }

    public void setCustomers(String customers) {
        this.customers = customers;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void charge(){
        System.out.println("charge method called()");
    }

    public void makePayment(){
        System.out.println("Make payment called()");
    }
}
