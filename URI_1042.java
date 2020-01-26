package uri_problems_solution;

import java.util.Scanner;

public class URI_1042 { //change class to "Main"

    public static void main(String[] args) {
        int X, Y, Z, Min, Mid=0, Max=0;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextInt();
        Z = sc.nextInt();
        Min = Math.min(X, Math.min(Y, Z));
        if (Min ==X) {
            Mid = Math.min(Y, Z);
            Max = Math.max(Y, Z);
        } else if (Min == Y) {
            Mid = Math.min(X, Z);
            Max = Math.max(X, Z);
        } else if (Min == Z) {
            Mid = Math.min(X, Y);
            Max = Math.max(X, Y);
        }
        System.out.println(Min+"\n"+Mid+"\n"+Max+"\n");
        System.out.print(X+"\n"+Y+"\n"+Z+"\n");
    }
}
