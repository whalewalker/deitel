package Java.com.making_a_difference;

public class Triangle {

    public static String generateTriangle(int hpy, int opp, int adj) {
        int rows = 9;
        for(hpy = 1; hpy <= rows; hpy++){
            for(opp = hpy; opp < rows; opp++){
                System.out.print(" ");
            }
            for(adj = 1; adj <= (2 * hpy - 1); adj++){
                if(adj == 1|| opp == rows ||adj == (2 * adj - 1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("");
        }
        return "";
    }
}
