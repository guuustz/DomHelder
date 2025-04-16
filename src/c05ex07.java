import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex07 {
    public static void main(String[] args) {
        // program to calculate the value of the function f(x) = √((x/4 + 1)² + 0.2x) for a given x.
        Scanner teclado = new Scanner(System.in);

        double funcaoFX, valorX;

        System.out.println("Insira um valor para X para calcular a função f(x): ");
        valorX = teclado.nextDouble();

        funcaoFX = Math.sqrt(Math.pow(valorX/4 + 1,2) + 0.2*valorX);

        System.out.println("Com o valor "+valorX+" a função f(x) é "+funcaoFX);

        teclado.close();
    }
}
