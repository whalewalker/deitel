package Java.com.dsa.foobar;

public class Partition {

    public int calculateNumberOfPartition(Integer number) {
        if (number == null) {
            throw new IllegalArgumentException("Number cannot be null");
        }
        if (number % 2 == 0){
            return number / 2;
        }
        return 0;
    }
}
