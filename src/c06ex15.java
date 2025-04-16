import java.util.*;
// by Gustavo Souza Reis
public class c06ex15 {
    public static void main(String[] args) {
        // program to calculate the total cost of a service package based on package type,
        // days used, extra services, and city tax.
        Scanner input = new Scanner(System.in);

        double servExtras, impostos = 0, valorFixo = 0, diariaPPP = 0, conta = 0f;
        int diasPPP;
        char codigo, codCidade;

        System.out.print("Digite o código do seu pacote: ");
        codigo = input.next().charAt(0);
        System.out.print("Digite a quantidade de dias do PPP: ");
        diasPPP = input.nextInt();
        System.out.print("Digite o valor dos extras: ");
        servExtras = input.nextDouble();
        System.out.println("Digite o código da sua cidade: ");
        System.out.println("1. Belo Horizonte" +
                           "\n2. São Paulo" +
                           "\n3. Rio de Janeiro" +
                           "\n4. Outras");
        codCidade = input.next().charAt(0);

        if (codigo == '1'){
            valorFixo = 65;
            diariaPPP = diasPPP * 1.2;
            if (diariaPPP > 65){
                diariaPPP = 65;
            }
        }
        else if (codigo == '2') {
            valorFixo = 104;
            diariaPPP = diasPPP * 2.1;
        }
        else if (codigo == '3'){
            valorFixo = 137;
            diariaPPP = diasPPP * 0;
        }

        if (codCidade == '1'){
            impostos = 0;
        }
        else if (codCidade == '2') {
            impostos = 0.01;
        }
        else if (codCidade == '3') {
            impostos = 0.015;
        }
        else if (codCidade == '4') {
            impostos = 0.02;
        }

        conta = valorFixo + diariaPPP + servExtras + (impostos * valorFixo) + (impostos * diariaPPP) + (impostos * servExtras);

        System.out.printf("Sua conta será: R$%.2f",conta);

        input.close();
    }
}
