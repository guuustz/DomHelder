import java.util.*;
// by Gustavo Souza Reis
public class c07ex01 {
    public static void main(String[] args) {
        // program to determine the prize based on the number of games won using a switch statement.
        Scanner input = new Scanner(System.in);

        int jogos;
        String nome;

        System.out.print("Insira seu nome: ");
        nome = input.nextLine();
        System.out.print("Insira quantos jogos você ganhou: ");
        jogos = input.nextInt();

        switch (jogos){
            case 1, 2, 3, 4, 5 ->
                    System.out.println("Não ganhou prêmio.");
            case 6, 7, 8, 9, 10 ->
                    System.out.println("Parabéns! Ganhou outro cartão!");
            case 11 ->
                    System.out.println("Parabéns! Ganhou R$100,00");
            case 12 ->
                    System.out.println("Parabéns! Ganhou R$1000,00");
            case 13 ->
                    System.out.println("Parabéns! Ganhou R$50.000,00");
            default ->
                System.out.println("Número de jogos inváildo.");
        }

        input.close();
    }
}
