import java.util.*;
// by Gustavo Souza Reis
public class c08ex02 {
    public static void main(String[] args) {
        // program to evaluate 50 students' grades and attendance,
        // approving those with grade > 65 and absences < 16.
        Scanner input = new Scanner(System.in);

        int nota = 0, falta = 0;

        for (int rept = 1; rept <= 50; rept++){
            System.out.print("insira sua nota: ");
            nota = input.nextInt();
            System.out.print("insira suas qtd de faltas: ");
            falta = input.nextInt();

            if (nota == -1)
                break;

            if (nota > 65 && falta < 16){
                System.out.println("ALUNO APROVADO\n");
            }   else
                System.out.println("ALUNO REPROVADO\n");

        }

        input.close();
    }
}
