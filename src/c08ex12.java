import java.util.*;
// by Gustavo Souza Reis
public class c08ex12 {
    public static void main(String[] args) {
        // program to calculate total revenue from sales based on product codes and their respective prices.
        Scanner input = new Scanner(System.in);

        char codigo;
        int vendas, mod1 = 0, mod2 = 0, mod3 = 0, mod4 = 0, mod5 = 0;
        double faturamento;

        System.out.print("Insira o número de vendas este mês: ");
        vendas = input.nextInt();

        for (int loop = 1; loop <= vendas; loop++) {
            System.out.print("Insira o código do seu equipamento: ");
            codigo = input.next().charAt(0);

            switch (codigo){
                case '1' -> mod1++;
                case '2' -> mod2++;
                case '3' -> mod3++;
                case '4' -> mod4++;
                case '5' -> mod5++;
                default -> System.out.println("Código inválido");
            }
        }
        faturamento = (mod1 * 1565) + (mod2 * 1890) + (mod3 * 2150) + (mod4 * 2963) + (mod5 * 3750);
        System.out.println("Faturamento final de : "+faturamento);
        input.close();
    }
}
