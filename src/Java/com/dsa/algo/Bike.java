package Java.com.dsa.algo;


public class Bike {
    public int gear;
    private  String name;
    private boolean isOff;
    private int accelerate;
    private int decelerate;
    public  boolean isOn;
    public boolean turnOff;
    private int gearOne;
    private int gearTwo;
    private int gearThree;
    private int gearFour;


    public Bike(String bikeName,int accelerate,int deacceletrate){
        name = bikeName;
        gear=1;
    }

    public  String getbikeName(String bikeName) {
        return name;
    }


    public boolean isOn() {
        return isOn;
    }

    public boolean turnOn() {
        return isOn=true;
    }

    public boolean isOff() {
        return true;
    }

    public boolean turnOff() {
        return isOff=true;

    }

    public int canAccelerate() {
        return accelerate;
    }

    public int IncreaseAcceleration() {
        int gear;
        return gear = 0;

    }

    public int gearRange(int speed) {
        if (isOn) {
            if (speed > -1 && speed <= 20) {
                return gearOne += 1;
            }
            if (speed > 20 && speed <= 30) {
                return gearTwo += 2;
            }
            if (speed > 30 && speed < 40) {
                return gearThree += 3;
            }
            if (speed > 40) {
                return gearFour += 4;
            }

        }
        return 0;

    }


    public int HaveAGear ( int speed){
        gearOne += 20;
        if (speed <= gearOne) {
            return speed;

        }
        return 0;
    }



    public String getName() {
        return name;
    }

    public int getAccelerate() {
        return 0;
    }

    public int getDeacceletrate() {
        return 0;
    }

    public int getGear() {
        return 0;
    }

    public int Deaccelerate() {
        return gear--;
    }
}


