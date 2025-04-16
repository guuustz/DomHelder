import java.util.Scanner;
// by Gustavo Souza Reis
public class c06ex01 {
    public static void main(String[] args) {
        // program to calculate the value of the function f(x) based on the input value of x, with different calculations for x < 4, x = 4, and x > 4.
        Scanner teclado = new Scanner(System.in);

        int x;
        double fx;
        System.out.print("Coloque um valor inteiro para x, afim de calcular a função: ");
        x = teclado.nextInt();

        if (x<4){
            fx = (5 * x + 3) / Math.sqrt(16 - Math.pow(x,2));
            System.out.println("O valor de fx é "+fx);
        }
        else if (x==4) {
            fx = 0;
            System.out.println("O valor de fx é "+fx);
        }
        else if (x>4) {
            fx = (5 * x + 3) / Math.sqrt(Math.pow(x,2) - 16);
            System.out.println("O valor de fx é "+fx);
        }


        teclado.close();
    }
}
