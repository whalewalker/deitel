package Java.com.javaChapter5;

public class PythagoreanTriples {
    public static void main(String[] args) {
        int opp = 1;
        int adj = 1;
        int hpy = 20000000;


        for (double i = 1; i <= 50000; i++) {
                for (int k = 1; k <= i; k++) {
                    for (int j = 1; j <= k; j++) {
                        opp = hpy - (int) (Math.pow(j, 2));
                    }
                    adj = hpy - opp;
                }
                opp = (int)(Math.sqrt(opp));
                adj = (int)(Math.sqrt(adj));

            if(hpy == (int) (Math.pow(opp, 2)) + (int) (Math.pow(adj, 2))){
                System.out.printf("%s%10s%15s%20s%20s%n", "Hypotenuse", "Opposite", "Adjacent", "OppSquare", "AdjSquare");
                System.out.printf("%3d%10d%15d%20d%20d%n", hpy, opp, adj, (int) (Math.pow(opp, 2)), (int) (Math.pow(adj, 2)));
            }
        }

    }
}

