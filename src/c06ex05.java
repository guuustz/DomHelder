import java.util.Scanner;
// by Gustavo Souza Reis
public class c06ex05 {
    public static void main(String[] args) {
        // program to check if a number is divisible by both 5 and 7.
        Scanner teclado = new Scanner(System.in);

        int num;
        System.out.println("Digite um número inteiro: ");
        num = teclado.nextInt();

        if (num % 5 == 0 && num % 7 == 0){
            System.out.println("Este número é divisível por 5 e 7.");
        }
        else {
            System.out.println("Este número NÃO é divisível por 5 e 7.");
        }

        teclado.close();
    }
}
