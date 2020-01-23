package uri_problems_solution;
import java.util.Scanner;
public class URI_1013 {
    public static void main(String[]args) {
        int A, B, C, T;
        Scanner sc = new Scanner(System.in);
	A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        T = A;
        if(A<B||A<C) {
            if(B<C) {
                T = C;
            } else {
                T = B;
            }
        }
	System.out.println(T+" eh o maior");
    }
}
