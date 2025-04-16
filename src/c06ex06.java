import java.util.Scanner;
// by Gustavo Souza Reis
public class c06ex06 {
    public static void main(String[] args) {
        // program to calculate the real roots of a quadratic equation using the discriminant (delta).
        Scanner teclado = new Scanner(System.in);

        int valorA, valorB, valorC, valorX;
        double raizPos, raizNeg, delta;

        System.out.print("Insira o valor de A: ");
        valorA = teclado.nextInt();
        System.out.print("Insira o valor de B: ");
        valorB = teclado.nextInt();
        System.out.print("Insira o valor de C: ");
        valorC = teclado.nextInt();

        delta = Math.pow(valorB,2) - 4 * valorA * valorC;
        raizPos = (-valorB + Math.sqrt(delta))/(2 * valorA);
        raizNeg = (-valorB - Math.sqrt(delta))/(2 * valorA);


        if (delta > 0){
            System.out.println("Há duas raízes reais. São elas: "+raizPos+" e "+raizNeg);
        }
        else if (delta == 0) {
            System.out.println("Há uma raíz."+raizPos);
        }
        else if (delta < 0) {
            System.out.println("Não possui raízes.");
        }

        teclado.close();
    }
}
