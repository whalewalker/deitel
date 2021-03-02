package Java.com.javaChapter9.progression;

public abstract class AbstractProgression {
    private Long current;

    public AbstractProgression(Long current) {
        this.current = current;
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    public abstract void advance();

    public Long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    public String printProgression(int capacity) {
        StringBuilder builder = new StringBuilder();
        for(int count = 0; count < capacity; count++){
                builder.append(nextValue()).append(",");
        }
        return builder.toString();
    }





}
