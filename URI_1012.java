package uri_problems_solution;
import java.util.Scanner;
public class URI_1012 { //change class to "Main"
    public static void main(String[]args) {
        double A, B, C;
        Scanner sc = new Scanner(System.in);
	      A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

	      System.out.printf("TRIANGULO: %.3f\n", (A * C) / 2);
        System.out.printf("CIRCULO: %.3f\n", C * C * 3.14159);
        System.out.printf("TRAPEZIO: %.3f\n", ((A + B) / 2) * C);
        System.out.printf("QUADRADO: %.3f\n", B * B);
        System.out.printf("RETANGULO: %.3f\n", A * B);

        //System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", (A * C) / 2, C * C * 3.14159, ((A + B) / 2) * C, B * B, A * B);
    }
}
