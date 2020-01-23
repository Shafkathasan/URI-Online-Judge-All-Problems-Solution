package uri_problems_solution;
import java.util.Scanner;
public class URI_1011 { //change class to "Main"
    public static void main(String[]args) {
        float R;
        Scanner sc = new Scanner(System.in);
        R = sc.nextFloat();
	      System.out.printf("VOLUME = %.3f\n",(4 * 3.14159 * Math.pow(R, 3.0) /3));
    }
}
