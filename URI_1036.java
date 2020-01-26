package uri_problems_solution;
import java.util.Scanner;
public class URI_1036 { //change class to "Main"
    public static void main(String[]args) {
        double A, B, C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        if ((A == 0) || (((B*B) -(4*A*C)) < 0)) {
        System.out.println("Impossivel calcular");
        } else {
        System.out.printf("R1 = %.5f\n", ((-B + Math.sqrt(((B*B) -(4*A*C)))) / (2*A)));
        System.out.printf("R2 = %.5f\n", ((-B - Math.sqrt(((B*B) -(4*A*C)))) / (2*A)));
        }
    }
}
