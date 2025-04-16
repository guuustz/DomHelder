import java.util.*;
// by Gustavo Souza Reis
public class c07ex03 {
    public static void main(String[] args) {
        // program to calculate a late tax penalty based on the number of overdue days using a switch statement.
        Scanner input = new Scanner(System.in);

        double imposto, percent;
        int dias;

        System.out.print("Insira o valor do imposto: ");
        imposto = input.nextDouble();
        System.out.print("Insira os dias de atraso: ");
        dias = input.nextInt();

        switch (dias) {
            case 1, 2, 3, 4, 5 -> percent = 0;
            case 6, 7, 8 -> percent = imposto * 0.02;
            case 9, 10 -> percent = (imposto * 0.1) + (dias * 0.5);
            default -> {
                if (dias > 10) {
                    percent = (imposto * 1.5) + (dias);
                }
                else {
                    percent = 0;
                }
            }
        }

        System.out.println("O valor da multa a ser paga é de "+percent);

        input.close();
    }
}
