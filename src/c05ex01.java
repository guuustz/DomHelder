import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex01 {
    public static void main(String[] args) {
        // program to calculate the value of the function f(x) = x³ + 4x + 10 for a given x.
        int x;
        double fx;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Coloque um número para representar X no cálculo de f(x) = x^3 + 4x + 10");
        System.out.print("Insira seu número: ");
        x = teclado.nextInt();
        fx = Math.pow(x,3) + 4 * x + 10;

        System.out.println("Em f(x) = x^3 + 4x + 10, o valor "+x+"  é:"+fx);
        teclado.close();
    }
}
