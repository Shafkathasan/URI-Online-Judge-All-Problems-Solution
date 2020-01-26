package uri_problems_solution;

import java.util.*;

public class URI_1045 { //change class to "Main"

    public static void main(String[] args) {
        double [] A = new double[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i < A.length; i++) {
            A[i] = sc.nextDouble();
        }
        Arrays.sort(A); // [C, B, A]/[Min, Mid, Max]
        if (A[2] >= (A[1]+A[0])) { //if A ≥ B + C
            System.out.println("NAO FORMA TRIANGULO");
        } else if (A[2]*A[2] == ((A[1]*A[1])+(A[0]*A[0]))) {
            System.out.println("TRIANGULO RETANGULO");
        } else if (A[2]*A[2] > ((A[1]*A[1])+(A[0]*A[0]))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (A[2]*A[2] < ((A[1]*A[1])+(A[0]*A[0]))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A[2] == A[1] && A[2] == A[0]) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (((A[2] == A[1]) &&(A[2] != A[0])) || ((A[2] == A[0]) &&(A[2] != A[1])) || ((A[1] == A[0]) &&(A[1] != A[2]))) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
