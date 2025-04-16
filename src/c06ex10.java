import java.util.*;
// by Gustavo Souza Reis
public class c06ex10 {
    public static void main(String[] args) {
        // program to calculate the amount to be redeemed after applying interest,
        // tax, and a fixed fee based on the capital invested, the number of days, and the daily interest rate.
        Scanner input = new Scanner(System.in);

        double valorResg = 0f, capitalApl, numDias, taxaDiaria, rendimento, impRenda;

        System.out.print("Insira o capital aplicado: ");
        capitalApl = input.nextDouble();
        System.out.print("Insira o número de dias: ");
        numDias = input.nextDouble();
        System.out.print("Insira a taxa diária: ");
        taxaDiaria = input.nextDouble();

        rendimento = capitalApl * (taxaDiaria/100) * numDias;
        impRenda = rendimento * 0.15;
        valorResg = capitalApl + rendimento - impRenda - 10;

        System.out.printf("Seu valor resgatado foi de R$%1.2f",valorResg);

        input.close();
    }
}
