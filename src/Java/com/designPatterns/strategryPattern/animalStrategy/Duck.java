package Java.com.designPatterns.strategryPattern.animalStrategy;

public class Duck {
    Flyable flyable;
    Quackable quackable;
    Displayable displayable;

    public Duck(Flyable flyable, Quackable quackable, Displayable displayable) {
        this.flyable = flyable;
        this.quackable = quackable;
        this.displayable = displayable;
    }
}
