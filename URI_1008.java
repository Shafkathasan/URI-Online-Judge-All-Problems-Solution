package uri_problems_solution;
import java.util.Scanner;
public class URI_1008 { //change class to "Main"
    public static void main(String[]args) {
        int N , S;
        float P;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
	      S = sc.nextInt();
        P = sc.nextFloat();
	      System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",N,S*P);
    }
}
