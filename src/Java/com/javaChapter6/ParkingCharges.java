package Java.com.javaChapter6;


public class ParkingCharges {

    private final double MINIMUM_CHARGE = 2.00;
    private final double MAXIMUM_CHARGE = 10.00;
    private double charge;
    private int hour;


    public ParkingCharges(int hour) {
        if (hour >= 3) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 3) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public double getCharge() {
        return charge;
    }


    public double calculateCharge(int hour) {
        double totalCharge = 0.0;
        if (hour == 3) {
            totalCharge = MINIMUM_CHARGE;
        } else {
            totalCharge = hourlyRate(hour);
        }

        return totalCharge;
    }

    public double calculatePrice(int hour) {
        hour = hour - 3;
        return (hour * 0.5) + MINIMUM_CHARGE;
    }

    public double hourlyRate(int hour) {
        if (hour < 3) {
            charge = 0.0;
        } else if(hour == 3){
            charge = MINIMUM_CHARGE;
        }else if(hour == 24){
            charge = MAXIMUM_CHARGE;
        }
        else {
            return calculatePrice(hour);
        }
        return charge;
    }

}
