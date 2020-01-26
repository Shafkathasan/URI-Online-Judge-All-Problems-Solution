package uri_problems_solution;
import java.util.Scanner;
public class URI_1021 { //change class to "Main"
    public static void main(String[]args) {
        float N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextFloat();
        System.out.println("NOTAS:");
	System.out.println((int)N/100+" nota(s) de R$ 100.00");
        N = N%100;
        N = (float) (Math.round(N * 100.0) / 100.0);
        System.out.println((int)N/50+" nota(s) de R$ 50.00");
        N = N%50;
        System.out.println((int)N/20+" nota(s) de R$ 20.00");
        N = N%20;
        System.out.println((int)N/10+" nota(s) de R$ 10.00");
        N = N%10;
        System.out.println((int)N/5+" nota(s) de R$ 5.00");
        N = N%5;
        System.out.println((int)N/2+" nota(s) de R$ 2.00");
        N = N%2;
        System.out.println("MOEDAS:");
        System.out.println((int)N/1+" moeda(s) de R$ 1.00");
        N = (float)(N%1); 
        System.out.println((int)(N/0.5)+" moeda(s) de R$ 0.50");
        N = (float) (N%(0.5));
        System.out.println((int)(N/0.25)+" moeda(s) de R$ 0.25");
        N = (float) (N%(0.25));
        System.out.println((int)(N/0.10)+" moeda(s) de R$ 0.10");
        N = (float) (N%(0.10));
        System.out.println((int)(N/0.05)+" moeda(s) de R$ 0.05");
        N = (float) (N%(0.05));
        System.out.println((int)(N/0.01)+" moeda(s) de R$ 0.01");
    }
}
