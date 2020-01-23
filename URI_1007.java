package uri_problems_solution;
import java.util.Scanner;
public class URI_1007 {
    public static void main(String[]args) {
        int A , B, C, D, R;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
	B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        R = A*B - C*D;
	System.out.printf("DIFERENCA = %d\n", R);
    }
}
