package Java.com.javaChapter9.progression;

public class ArithmeticProgression extends Progression{
    private long increment;

    public ArithmeticProgression(){
        this(0, 1);
    }

    public ArithmeticProgression(long stepSize){
       this(stepSize, 0);
    }

    public ArithmeticProgression(long stepSize, long start){
        super(start);
        this.increment = stepSize;
    }

    @Override
    public void advance() {
        setCurrent(getCurrent() + increment);
    }
}
