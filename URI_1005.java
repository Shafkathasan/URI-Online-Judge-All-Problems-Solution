package uri_problems_solution;
import java.util.Scanner;
public class URI_1005 {
    public static void main(String[]args) {
        float A , B, M;
        Scanner sc = new Scanner(System.in);
        A = sc.nextFloat();
	B = sc.nextFloat();
        M = (float)(((A*3.5)+(B*7.5))/(3.5+7.5));
	System.out.printf("MEDIA = %.5f\n", M);
    }
}
