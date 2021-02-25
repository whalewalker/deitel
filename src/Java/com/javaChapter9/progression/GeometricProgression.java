package Java.com.javaChapter9.progression;

public class GeometricProgression extends Progression{
    private long base;

    public GeometricProgression(){
        this(2, 1);
    }

    public GeometricProgression(long base){
        this(base, 1);
    }
    public GeometricProgression(long base, long start){
        super(start);
        this.base = base;
    }

    public long getBase() {
        return base;
    }

    public void advance(){
        setCurrent(getCurrent() * base);
    }
}
