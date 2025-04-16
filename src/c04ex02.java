import java.util.Scanner;
// by Gustavo Souza Reis
public class c04ex02 {
    public static void main(String[] args) {
        // program to collect and display an employee's personal and professional information.
        String nome, cpf, identidade, tituloEleitor, cnh, nomeEmpresa;
        double salario;

        Scanner teclado = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("digite seu cpf: ");
        cpf = teclado.nextLine();

        System.out.println("digite seu rg: ");
        identidade = teclado.nextLine();

        System.out.println("digite seu título de eleitor: ");
        tituloEleitor = teclado.nextLine();

        System.out.println("digite sua cnh: ");
        cnh = teclado.nextLine();

        System.out.println("digite o nome da sua empresa: ");
        nomeEmpresa = teclado.nextLine();

        System.out.println("digite seu salário: ");
        salario = teclado.nextDouble();


        System.out.println("FICHA FUNCIONAL DE: "+nome);
        System.out.println("\nDocumentos: ");
        System.out.println("CPF: "+cpf);
        System.out.println("CI: "+identidade);
        System.out.println("Título de eleitor: "+tituloEleitor);
        System.out.println("Carteira de Monorista(CNH): "+cnh);
        System.out.println("\nEmpresa: "+nomeEmpresa);
        System.out.println("Salário: "+salario);



        teclado.close();
    }
}
