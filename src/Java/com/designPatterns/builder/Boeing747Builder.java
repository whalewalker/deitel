package Java.com.designPatterns.builder;

public class Boeing747Builder extends AirCraftBuilder{

    private Boeing747 boeing747 = new Boeing747();

    @Override
    public void buildEngine() {
        super.buildEngine();
    }

    @Override
    public void buildWings() {
        super.buildWings();
    }

    @Override
    public void buildCockpit() {
        super.buildCockpit();
    }

    @Override
    public void buildBathrooms() {
        super.buildBathrooms();
    }

    @Override
    public IAircraft getResult() {
        return boeing747;
    }
}
