import java.util.*;
// by Gustavo Souza Reis
public class c08ex09 {
    public static void main(String[] args) {
        // Program to calculate and display the average age of men and women
        // based on input from multiple individuals, counting each gender and summing their ages.
        Scanner input = new Scanner(System.in);

        int idade, contM = 0, contF = 0, pessoas, somaFem = 0, somaMasc = 0;
        char sexo;
        String nome;
        double mediaFem = 0, mediaMasc = 0;

        System.out.print("Insira o número de pessoas para perguntar: ");
        pessoas = input.nextInt();

        for (int loop = 1; loop <= pessoas; loop++){
            System.out.print("\nInsira seu gênero[Use F para feminino e M para Masculino]: ");
            sexo = input.next().charAt(0);
            input.nextLine();

            System.out.print("Insira seu nome: ");
            nome = input.nextLine();

            System.out.print("Insira sua idade: ");
            idade = input.nextInt();


            if (sexo == 'F' || sexo == 'f'){
                contF++;
                somaFem += idade;
            } else {
                contM++;
                somaMasc += idade;
            }
        }

            if (contF > 0){
                mediaFem = (double) somaFem / contF;
            }

            if (contM > 0){
                mediaMasc = (double) somaMasc / contM;
            }

        System.out.println("Média dos homens é "+mediaMasc);
        System.out.println("Média das mulheres é "+mediaFem);

        input.close();
    }
}
