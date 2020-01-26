package uri_problems_solution;

import java.util.Scanner;

public class URI_1043 { //change class to "Main"

    public static void main(String[] args) {
        float A, B, C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        if ((A < (float)(B+C)) && (B < (float)(A+C)) && (C < (float)(B+A))) {
            System.out.printf("Perimetro = %.1f\n",(A + B + C));
        } else {
            System.out.printf("Area = %.1f\n",((A + B) * C) / 2);
        }

    }
}
