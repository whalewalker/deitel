package Java.com.javaChapter9.progression;

public class Fibonacci extends AbstractProgression {

    private long prevNum;

    public Fibonacci() {
       this(0, 1);
    }

    public Fibonacci(long first, long second) {
        super(second);
        prevNum = second - first;
    }

    public Long getPrevious() {
        return prevNum;
    }

    @Override
    public void advance() {
        long temp = prevNum;
        prevNum = getCurrent();
        setCurrent(getCurrent() + temp);
    }

    public long getPrevNum() {
        return prevNum;
    }

}
