package Java.com;

public class Example {
    public static void main(String[] args) {
//        int k = 1;
//        int i = ++k + k++ + + k;
//        System.out.println(i);
//
//        System.out.println(1/2+3/2+0.1);
//        int a, b, c ;
//        b = 10;
//        a = b = c = 20;
//        System.out.println(a);
//
//        int j = 0;
//        addTwo(j++);
//        System.out.println(j);


        int i = 0;
        int j = 0;

        boolean t = true;
        boolean r;

        r = (t & 0 < (i +=1));
        r = (t && 0 <(i+=2));
        r = (t | 0<(j+=1));
        r = (t || 0<(j+=2));

        System.out.println(i + " " + j);

    }

    private static void addTwo(int i) {
        i += 2;
    }
}
