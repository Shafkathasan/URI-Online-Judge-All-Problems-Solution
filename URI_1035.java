package uri_problems_solution;
import java.util.Scanner;
public class URI_1035 { //change class to "Main"
    public static void main(String[]args) {
        int A, B, C,D;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        if((B>C)&&(D>A)&&((C+D)>(A+B))&&C>0&&D>0&&(A%2==0)) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
