package uri_problems_solution;
import java.util.Scanner;
public class URI_1038 {
    public static void main(String[]args) {
        int X, Y;
        float P = 0;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();
        if (X==1) {
            P  = (float) (4.00 * Y);
        }else if (X == 2) {
            P  = (float) (4.50 * Y);
        }else if (X == 3) {
            P  = (float) (5.00 * Y);
        }else if (X == 4) {
            P  = (float) (2.00 * Y);
        }else if (X == 5) {
            P  = (float) (1.50 * Y);
        }
        System.out.printf("Total: R$ %.2f\n",P);
    }
}
