import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex08 {
    public static void main(String[] args) {
        // program to calculate the radius of a circle sector given its area and central angle.
        Scanner teclado = new Scanner(System.in);

        double setorCircular, angulo, raio, pi;
        System.out.println("Insira a área do setor circular: ");
        setorCircular = teclado.nextDouble();
        System.out.println("Insira o valor do ângulo: ");
        angulo = teclado.nextDouble();

        pi = 3.1416;

        raio = Math.sqrt((setorCircular*360)/(angulo*pi));

        System.out.println("O valor do raio é "+raio);

        teclado.close();
    }
}
