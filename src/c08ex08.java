import java.util.*;
// by Gustavo Souza Reis
public class c08ex08 {
    public static void main(String[] args) {
        // Program to track student approvals and rejections,
        // calculate the average grade of approved students, and count those with more than 16 absences.
        Scanner input = new Scanner(System.in);

        int nota, falta, contAprov = 0, contDesaprov = 0,contDesaprovF = 0;
        double media, somaNota = 0;

        for (int loop = 1; loop <= 50; loop++) {
            System.out.print("Insira suas notas: ");
            nota = input.nextInt();
            System.out.print("Insira suas faltas: ");
            falta = input.nextInt();

            if (nota == 0)
                break;

            if (nota >= 65 && falta < 16) {
                System.out.println("\nAluno aprovado.\n");
                somaNota += nota;
                contAprov++;
            }
            else
                System.out.println("\nAluno reprovado.\n");
            contDesaprov++;

                if (falta > 16){
                contDesaprovF++;
            }

        }

        media = somaNota / contAprov;
        System.out.println("Média de alunos aprovados: "+media);
        System.out.println("Qtd de alunos com mais de 16 faltas: "+contDesaprovF);

        input.close();
    }
}
