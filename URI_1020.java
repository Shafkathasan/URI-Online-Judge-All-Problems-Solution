package uri_problems_solution;
import java.util.Scanner;
public class URI_1020 { //change class to "Main"
    public static void main(String[]args) {
        int D, Y, M;
        Scanner sc = new Scanner(System.in);
        D = sc.nextInt();
        Y = D/365;
        D = D%365;
        M = D/30;
        D = D%30;
	System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n",Y,M,D);
    }
}
