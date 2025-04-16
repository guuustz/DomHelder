import java.util.*;
// by Gustavo Souza Reis
public class c08ex24 {
    public static void main(String[] args) {
        // calculates the sum of a series where each term is 2
        // raised to an odd number, divided by 3, for odd numbers between 1 and 99.
        Scanner input = new Scanner(System.in);
        double serie = 0;

        for (int loop = 1; loop <= 99; loop+= 2){
            serie += (Math.pow(2,loop) / 3);
        }

        System.out.println("Valor da série:"+ serie);

        input.close();
    }
}
