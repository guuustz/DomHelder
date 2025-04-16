import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex02 {
    public static void main(String[] args) {
        // program to calculate the surface area and volume of a sphere based on its radius.
        Scanner teclado = new Scanner(System.in);

        double area, raio, pi, volume;
        pi = 3.1416;

        System.out.println("Bem vindo ao programa de leitor de Raio");
        System.out.print("Selecione um valor para ler a área de sua esfera: ");
        raio = teclado.nextDouble();

        area = 4 * pi * Math.pow(raio,2);
        volume = (4 * pi * Math.pow(raio,3)) / 3;

        System.out.println("Com o Raio "+raio+" sua área é "+area+" e seu volume é "+volume);

        teclado.close();
    }
}
