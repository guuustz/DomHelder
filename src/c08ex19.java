import java.util.*;
// by Gustavo Souza Reis
public class c08ex19 {
    public static void main(String[] args) {
        // calculates and prints the sum of the squares of the first 100 numbers.
        Scanner input = new Scanner(System.in);

        double cont = 0, soma = 0;

        for (int loop = 1; loop <= 100; loop++){
            cont = Math.pow(loop, 2);
            soma += cont;
        }


        System.out.println("Números de uma progressão numerica: "+soma);

        input.close();
    }
}
