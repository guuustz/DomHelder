import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex06 {
    public static void main(String[] args) {
        // program to calculate the distance between a point and a line in a 2D plane using the formula for distance from a point to a line.
        Scanner teclado = new Scanner(System.in);

        double retaA, retaB, retaC, reta, ponto, pontoX, pontoY, distancia;
        System.out.println("Insira valores para calcular a distância entre o ponto P e a reta R");
        System.out.print("Insira o valor de A: ");
        retaA = teclado.nextDouble();
        System.out.print("Insira o valor de B: ");
        retaB = teclado.nextDouble();
        System.out.print("Insira o valor de C: ");
        retaC = teclado.nextDouble();

        System.out.print("Agora, digite as coordenadas de x: ");
        pontoX = teclado.nextDouble();
        System.out.print("Digite as coordenadas de y: ");
        pontoY = teclado.nextDouble();

        reta = (retaA * pontoX) + (retaB * pontoY) + retaC;
        ponto = Math.sqrt(Math.pow(retaA,2)+Math.pow(retaB,2));
        distancia = reta / ponto;

        System.out.println("Sua distância(D) é de "+distancia);

        teclado.close();
    }
}
