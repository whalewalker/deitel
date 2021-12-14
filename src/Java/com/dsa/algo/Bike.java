package Java.com.dsa.algo;

public class Bike{
    private String name;
    private boolean isOn;
    private int gear;
    private int speed;

    public Bike(String name) {
        this.name = name;
        gear = 0;
        speed = 0;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGear() {
        if (isOn){
            if(speed>=0 && speed <=20) {
                gear = 1;
            }
             if(speed>20 && speed<=30){
                 gear =2;
            }
        }
        return gear;
    }

    public void setSpeed(int speedValue) {
        speed = speedValue;
    }


    public int getSpeed(){
        return speed;
    }

    public void accelerate() {
        if (isOn){
            if (speed>= 0 && speed<= 20)speed += 1;
            if (speed> 20 && speed<= 30)speed += 2;
        }
    }
}
