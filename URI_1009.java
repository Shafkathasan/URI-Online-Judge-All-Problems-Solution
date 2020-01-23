package uri_problems_solution;
import java.util.Scanner;
public class URI_1009 {
    public static void main(String[]args) {
        double S=0, V, T;
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
	S = sc.nextFloat();
        V = sc.nextFloat();
        T = S + V*0.15;
	System.out.printf("TOTAL = R$ %.2f\n",T);
    }
}
