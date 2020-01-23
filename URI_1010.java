package uri_problems_solution;
import java.util.Scanner;
public class URI_1010 {
    public static void main(String[]args) {
        int A, B;
        float C, T;
        Scanner sc = new Scanner(System.in);
	A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextFloat();
        T = B*C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextFloat();
        T += B*C;
	System.out.printf("VALOR A PAGAR: R$ %.2f\n",T);
    }
}
