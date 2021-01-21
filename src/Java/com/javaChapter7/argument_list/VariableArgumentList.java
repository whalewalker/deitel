package Java.com.javaChapter7.argument_list;

public class VariableArgumentList {
    public static double product(double... numbers) {
        double product = 1;
        for(double number : numbers){
            product *= number;
        }
        return product;
    }

    public static double sum(double... numbers) {
        double product = 0;
        for(double number : numbers){
            product += number;
        }
        return product;
    }

}
