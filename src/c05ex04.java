import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex04 {
    public static void main(String[] args) {
        // program to calculate the distance between two points in a Cartesian plane.
        Scanner teclado = new Scanner(System.in);

        int x1, x2, y1, y2;
        double distancia;
        System.out.println("Bem vindo ao programa do plano cartesiano!");
        System.out.print("Digite o X do ponto 1: ");
        x1 = teclado.nextInt();
        System.out.print("Digite o Y do ponto 1: ");
        y1 = teclado.nextInt();
        System.out.print("Digite o X do ponto 2: ");
        x2 = teclado.nextInt();
        System.out.print("Digite o Y do ponto 2: ");
        y2 = teclado.nextInt();

        distancia = Math.sqrt(Math.pow(x1 - x2,2)+Math.pow(y1 - y2,2));

        System.out.println("A distãncia entre os dois pontos é "+distancia);


        teclado.close();
    }
}
