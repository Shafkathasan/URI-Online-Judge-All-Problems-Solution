package uri_problems_solution;
import java.util.Scanner;
public class URI_1006 { //change class to "Main"
    public static void main(String[]args) {
        float A , B, C, M;
        Scanner sc = new Scanner(System.in);
        A = sc.nextFloat();
	      B = sc.nextFloat();
        C = sc.nextFloat();
        M = (float)(((A*2)+(B*3)+(C*5))/10); //10=2+3+5
	      System.out.printf("MEDIA = %.1f\n", M);
    }
}
