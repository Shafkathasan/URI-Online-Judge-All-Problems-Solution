package uri_problems_solution;

import java.util.Scanner;

public class URI_1041 { //change class to "Main"

    public static void main(String[] args) {
        float X, Y;
        Scanner sc = new Scanner(System.in);
        X = sc.nextFloat();
        Y = sc.nextFloat();
        if (X == 0 && Y == 0) {
            System.out.println("Origem");
        } else if (X == 0) {
            System.out.println("Eixo Y");
        } else if (Y == 0) {
            System.out.println("Eixo X");
        } else if (X > 0 && Y > 0) {
            System.out.println("Q1");
        } else if (X > 0 && Y < 0) {
            System.out.println("Q4");
        } else if (X < 0 && Y > 0) {
            System.out.println("Q2");
        } else {
            System.out.println("Q3");
        }

    }
}
