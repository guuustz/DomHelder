import java.util.*;
// by Gustavo Souza Reis
public class c08ex20 {
    public static void main(String[] args) {
        // prints a series where each term is double the previous one, and calculates the sum of the terms.
        Scanner input = new Scanner(System.in);

        int num;
        double termo = 1, soma = 0;

        System.out.print("Digite quantos números quer que o programa leia: ");
        num = input.nextInt();

        for (int loop = 0; loop < num; loop++){
            System.out.println(termo);
            soma += termo;
            termo *= 2;
        }

        System.out.println("A soma dos "+num+" é de "+soma);

        input.close();
    }
}
