package Java.com.designPatterns.builder;

import java.util.List;

public class Boeing747 implements IAircraft{
    private String name;

    @Override
    public boolean hasPassenger() {
        return true;
    }
}
