package Java.com.javaChapter9.progression;

public class ArithmeticAbstractProgression extends AbstractProgression {
    private long increment;

    public ArithmeticAbstractProgression(){
        this(0, 1);
    }

    public ArithmeticAbstractProgression(long stepSize){
       this(stepSize, 0);
    }

    public ArithmeticAbstractProgression(long stepSize, long start){
        super(start);
        this.increment = stepSize;
    }

    @Override
    public void advance() {
        setCurrent(getCurrent() + increment);
    }
}
