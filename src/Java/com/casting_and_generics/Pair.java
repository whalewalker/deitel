package Java.com.casting_and_generics;

public class Pair<first, second>{
    first A;
    second B;

    public Pair(first a, second b) {
        A = a;
        B = b;
    }

    public first getA() {
        return A;
    }

    public second getB() {
        return B;
    }
}
