import java.util.*;
// by Gustavo Souza Reis
public class c06ex09 {
    public static void main(String[] args) {
        // program to calculate the ideal weight based on gender and height using specific formulas for men and women.
        Scanner input = new Scanner(System.in);

        double altura, pesoIdeal = 0f;
        char genero;

        System.out.println("Insira seu gênero: [F para feminino e M para masculino]");
        genero = input.next().charAt(0);

        System.out.print("Insira sua altura: ");
        altura = input.nextDouble();

        if (genero == 'F'){
            pesoIdeal = 62.1 * altura - 44.7;
            System.out.printf("Seu peso ideal é de %1.3f",pesoIdeal);
        }
        else if (genero == 'M') {
            pesoIdeal = 72.7 * altura - 58;
            System.out.printf("Seu peso ideal é de %1.3f",pesoIdeal);
        }


        input.close();
    }
}
