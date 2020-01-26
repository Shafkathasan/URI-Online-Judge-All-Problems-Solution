package uri_problems_solution;
import java.util.Scanner;
public class URI_1016 { //change class to "Main"
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
	System.out.printf("%d minutos\n",(int)(D/((90-60)/60.0)));
        //Or, System.out.printf("%d minutos\n",(int) (d / ((90 / 60.0) - (60 / 60.0))));
    }
}
