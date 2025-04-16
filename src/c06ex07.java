import java.util.*;
// by Gustavo Souza Reis
public class c06ex07 {
    public static void main(String[] args) {
        // program to calculate the profit sharing based on the salary, with different conditions for salary ranges and tax deductions.
        Scanner teclado = new Scanner(System.in);

        double salario, plBruto, valorFixo, impRenda, plLiquido = 0f, percentSalario;

        System.out.print("Insira seu salário: ");
        salario = teclado.nextDouble();

        if (salario < 300){
            valorFixo = 500;
            percentSalario = salario * 0.7;
            plBruto = valorFixo + percentSalario;
            impRenda = plBruto * 0.25;
            plLiquido = plBruto - impRenda;
            System.out.printf("A participação nos lucros é de R$%1.2f",plLiquido);
        }
        else if (salario > 300 && salario <= 1000) {
            valorFixo = 200;
            percentSalario = salario * 0.5;
            plBruto = valorFixo + percentSalario;
            impRenda = plBruto * 0.25;
            plLiquido = plBruto - impRenda;
            System.out.printf("A participação nos lucros é de R$%1.2f",plLiquido);
        }
        else if (salario > 1000) {
            valorFixo = 0;
            percentSalario = salario * 0.3;
            plBruto = valorFixo + percentSalario;
            impRenda = plBruto * 0.25;
            plLiquido = plBruto - impRenda;
            System.out.printf("A participação nos lucros é de R$%1.2f",plLiquido);
        }

        teclado.close();
    }
}
