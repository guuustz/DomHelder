import java.util.*;
// by Gustavo Souza Reis
public class c08ex15 {
    public static void main(String[] args) {
        // Gathers employee data, finds the highest salary, calculates
        // the average salary for those under 18, and identifies senior employees.
        Scanner input = new Scanner(System.in);

        String nomeFunc, cargo, nomeSalario = "", cargoSalario = "";
        double salario = 0, somaSalario = 0, mediaSalario = 0, maiorSalario = 0;
        int idade = 0, qtdFunc, contJovens = 0;

        System.out.print("Insira quantos funcionários tem sua empresa: \n");
        qtdFunc = input.nextInt();
        input.nextLine();

        for (int loop = 1; loop <= qtdFunc; loop++){
            System.out.print("\nInsira seu nome: ");
            nomeFunc = input.nextLine();
            System.out.print("Insira seu cargo: ");
            cargo = input.nextLine();
            System.out.print("Insira seu salário: ");
            salario = input.nextDouble();
            System.out.print("Insira sua idade: ");
            idade = input.nextInt();
            input.nextLine();

            if (salario > 10000 && idade > 50){
                System.out.println("Este funcionário é SÊNIOR\n");
            }
            if (loop == 1 || salario > maiorSalario){
                maiorSalario = salario;
                nomeSalario = nomeFunc;
                cargoSalario = cargo;
            }
            if (idade <= 18) {
                contJovens++;
                somaSalario += salario;
                mediaSalario = somaSalario/contJovens;
            }
        }
        System.out.println("A média salarial dos funcionários com até 18 anos é "+mediaSalario);
        System.out.println("O maior salário da empresa pertence ao "+nomeSalario+" que recebe "+maiorSalario+" trabalhando de "+cargoSalario);

        input.close();
    }
}
