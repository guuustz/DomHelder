import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex09 {
    public static void main(String[] args) {
        // program to calculate the weighted average of three grades.
        Scanner teclado = new Scanner(System.in);

        double nota1, nota2, nota3, media;

        System.out.println("Calculador de Média!!!");
        System.out.print("Insira sua nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.print("Insira sua nota 2: ");
        nota2 = teclado.nextDouble();
        System.out.print("Insira sua nota 3: ");
        nota3 = teclado.nextDouble();

        media = (nota1 * 2 + nota2 * 3 + nota3 * 5)/10;

        System.out.println("Sua média final é "+media);

        teclado.close();
    }
}
