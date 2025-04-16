import java.util.Scanner;
// by Gustavo Souza Reis
public class c03ex05 {
    public static void main(String[] args) {
        // program to calculate a person's age based on their birth year and the current year.
        String nome;
        int anoNasc, anoAtual, idade;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Digite o ano em que você nasceu: ");
        anoNasc = teclado.nextInt();

        System.out.print("Digite o ano em que estamos: ");
        anoAtual = teclado.nextInt();

        idade = anoAtual - anoNasc;

        System.out.println(nome+", você tem/ terá "+idade+" anos em "+anoAtual);
        teclado.close();
    }
}
