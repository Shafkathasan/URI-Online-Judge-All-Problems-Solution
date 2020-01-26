package uri_problems_solution;
import java.util.Scanner;
public class URI_1019 { //change class to "Main"
    public static void main(String[]args) {
        int T, H, M;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        H = T/3600;
        T = T%3600;
        M = T/60;
        T = T%60;
	System.out.printf("%d:%d:%d\n",H,M,T);
    }
}
