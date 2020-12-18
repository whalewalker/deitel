package Java.com.javaChapter6;

public class VolumeOFSphere {

    private double radius;

    public double getRadius(){
        return radius;
    };

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateAreaOFASphere(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
