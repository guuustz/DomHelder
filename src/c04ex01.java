import java.util.Scanner;
// by Gustavo Souza Reis
public class c04ex01 {
    public static void main(String[] args) {
        // program to read a full name and age, then display the name in inverted format with the age.
        String nome, nomeMeio, sobrenome;
        long idade;

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("digite seu nome do meio: ");
        nomeMeio = teclado.nextLine();

        System.out.println("digite seu sobrenome: ");
        sobrenome = teclado.nextLine();

        System.out.println("digite sua idade: ");
        idade = teclado.nextLong();

        System.out.println(sobrenome+", "+nome+" "+nomeMeio);
        System.out.println("Idade: "+idade);

        teclado.close();
    }
}
