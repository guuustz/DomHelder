import java.util.Scanner;
// by Gustavo Souza Reis
public class c06ex03 {
    public static void main(String[] args) {
        // program to calculate the monthly salary based on sales, with a fixed value and commission depending on sales performance.
        Scanner teclado = new Scanner(System.in);

        double salario, valorFixo, comissao, vendasMensais;
        valorFixo = 240;

        System.out.println("Calculador de salário mensal!!!");
        System.out.print("Insira o valor das vendas mensais: ");
        vendasMensais = teclado.nextDouble();

        if (vendasMensais <= 1000){
            comissao = 0;
            salario = valorFixo + comissao;
            System.out.println("Seu salário será de R$"+salario);
        }
        else if (vendasMensais > 1000 && vendasMensais <= 10000) {
            comissao = 0.1 * vendasMensais;
            salario = valorFixo + comissao;
            System.out.println("Seu salário será de R$"+salario);
        }
        else if (vendasMensais > 10000) {
            comissao = 1000;
            salario = valorFixo + comissao;
            System.out.println("Seu salário será de R$"+salario);
        }


        teclado.close();
    }
}
