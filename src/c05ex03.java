import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex03 {
    public static void main(String[] args) {
        // program to calculate the net salary and income tax based on the number of dependents.
        Scanner teclado = new Scanner(System.in);

        double impRenda, salario, liquido;
        int dependentes;

        System.out.print("Informe seu salário: ");
        salario = teclado.nextDouble();
        System.out.print("Informe o número de dependentes: ");
        dependentes = teclado.nextInt();

        liquido = salario - (dependentes*60);
        impRenda = liquido*0.15;

        System.out.println("Seu salário líquido é de "+liquido+" e seu imposto de renda é "+impRenda);

        teclado.close();
    }
}
