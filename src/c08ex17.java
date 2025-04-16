import java.util.*;
// by Gustavo Souza Reis
public class c08ex17 {
    public static void main(String[] args) {
        // calculates and displays the value of fx = sqrt(x² - 3) for x from 3 to 12.
        Scanner input = new Scanner(System.in);

        double fx = 0f;

        for (int x = 3; x <= 12; x++){
            fx = Math.sqrt(Math.pow(x, 2) - 3);
            System.out.printf("\nValor de x: "+x+"\nValor de fx: %.4f",fx,"\n");
        }

        input.close();
    }
}
