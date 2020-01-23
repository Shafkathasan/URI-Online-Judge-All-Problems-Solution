package uri_problems_solution;
import java.util.Scanner;
public class URI_1015 {
    public static void main(String[]args) {
        float X1, X2, Y1, Y2;
        Scanner sc = new Scanner(System.in);
        X1 = sc.nextFloat();
        Y1 = sc.nextFloat();
        X2 = sc.nextFloat();
        Y2 = sc.nextFloat();
	System.out.printf("%.4f\n",Math.sqrt(Math.pow((X2-X1),2)+Math.pow(Y2-Y1,2)));
    }
}
