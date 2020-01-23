package uri_problems_solution;
import java.util.Scanner;
public class URI_1014 {
    public static void main(String[]args) {
        float X, Y;
        Scanner sc = new Scanner(System.in);
        X = sc.nextFloat();
        Y = sc.nextFloat();
	System.out.printf("%.3f km/l\n",X/Y);
    }
}
