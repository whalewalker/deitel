package Java.com.designPatterns.builder;

public class F16 implements IAircraft{
    private String name;

    @Override
    public boolean hasPassenger() {
        return false;
    }
}
