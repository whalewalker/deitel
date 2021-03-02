package Java.com.javaChapter9.progression;

public class GeometricAbstractProgression extends AbstractProgression {
    private long base;

    public GeometricAbstractProgression(){
        this(2, 1);
    }

    public GeometricAbstractProgression(long base){
        this(base, 1);
    }
    public GeometricAbstractProgression(long base, long start){
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
