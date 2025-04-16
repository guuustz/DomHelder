import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex10 {
    public static void main(String[] args) {
        // program to display each digit of a 5-digit number vertically.
        Scanner teclado = new Scanner(System.in);

        int numero;

        System.out.println("Leitor de números na vertical!!!");
        System.out.print("Insira seu número de 5 dígitos: ");
        numero = teclado.nextInt();

        System.out.println(numero / 10000);
        System.out.println(numero / 1000 % 10);
        System.out.println(numero / 100 % 10);
        System.out.println(numero % 100 / 10);
        System.out.println(numero % 10);


        teclado.close();
    }
}
