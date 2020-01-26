package uri_problems_solution;

import java.util.Scanner;

public class URI_1044 { //change class to "Main"

    public static void main(String[] args) {
        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
