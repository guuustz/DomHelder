import java.util.*;
// by Gustavo Souza Reis
public class c08ex30 {
    public static void main(String[] args) {
        // calculates the value of the series S by summing the logarithm of X and the terms of a power series.
        Scanner input = new Scanner(System.in);

        //declaração de variaveis
        long n;
        double x, serie;

        System.out.print("Insira o valor de X: ");
        x = input.nextDouble(); // leitor valor x
        System.out.print("Insira o valor de N: ");
        n = input.nextLong(); // leitor valor n

        serie = Math.log(x); // log ln x em serie

        //for para calcular a serie
        for (int loop = 1; loop <= n; loop++){
            serie += Math.pow(x,loop) / loop; // somatoria da serie
        }

        //print teste
        System.out.println("O valor da série S é: "+serie);

        input.close();
    }
}
