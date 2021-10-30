package Java.com.designPatterns.builder;

import javax.xml.parsers.DocumentBuilder;

public class Director {
    private AirCraftBuilder airCraftBuilder;

    DocumentBuilder documentBuilder;

    public Director(AirCraftBuilder airCraftBuilder) {
        this.airCraftBuilder = airCraftBuilder;
    }

    public void construct(AirCraftBuilder airCraftBuilder){
        airCraftBuilder.buildCockpit();
        airCraftBuilder.buildEngine();
        airCraftBuilder.buildWings();

        if (airCraftBuilder.getResult().hasPassenger()){
            airCraftBuilder.buildBathrooms();
        }
    }
}
