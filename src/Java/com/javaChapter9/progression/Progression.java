package Java.com.javaChapter9.progression;

public class Progression {
    private Long current;

    public Progression() {
        this(0L);
    }

    public Progression(Long current) {
        this.current = current;
    }

    public Long getCurrent() {
        return current;
    }

    public void setCurrent(Long current) {
        this.current = current;
    }

    public void advance() {
        current++;
    }

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
