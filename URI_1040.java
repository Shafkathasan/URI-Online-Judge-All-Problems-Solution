package uri_problems_solution;
import java.util.Scanner;
public class URI_1040 { //change class to "Main"
    public static void main(String[]args) {
        float N1, N2, N3, N4, N5, avg, ravg;
        Scanner sc = new Scanner(System.in);
        N1 = sc.nextFloat();
        N2 = sc.nextFloat();
        N3 = sc.nextFloat();
        N4 = sc.nextFloat();
        avg = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10; //Average/Media
        if (avg >= 7.0) {
            System.out.printf("Media: %.1f\n",avg);
            System.out.println("Aluno aprovado.");
        }else if (avg >= 5.0 && avg <= 6.9) {
            System.out.printf("Media: %.1f\n",avg);
            System.out.println("Aluno em exame.");
            N5 =sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",N5);
            ravg =(avg + N5) / 2; //Recalaverage
            if(ravg >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n",ravg);
        } else if (avg < 5.0){
            System.out.printf("Media: %.1f\n",avg);
            System.out.println("Aluno reprovado.");
        }
    }
}
