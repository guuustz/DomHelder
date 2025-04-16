import java.util.*;
// by Gustavo Souza Reis
public class c08ex03 {
    public static void main(String[] args) {
        // program to check approval of up to 50 students based on grade and absences, stopping if grade is -1.
        Scanner input = new Scanner(System.in);

        int nota = 0, falta = 0, cont = 0;

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
