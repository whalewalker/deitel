package Java.com.designPatterns.builder;

public class DriverClass {
    public static void main(String[] args) {
        F16Builder f16Builder = new F16Builder();
        Director director = new Director(f16Builder);
        director.construct(f16Builder);

        IAircraft f16 = f16Builder.getResult();
    }
}
