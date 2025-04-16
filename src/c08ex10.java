import java.util.*;
// by Gustavo Souza Reis
public class c08ex10 {
    public static void main(String[] args) {
        // Program to calculate the total cost of a project based on multiple
        // product inputs, determining the most expensive product and the average cost of all products used.
        Scanner input = new Scanner(System.in);

        String nomePrd, nomeCaro = "";
        double precoUnit, precoTotal = 0, mediaCusto = 0, prodCaro = 0;
        int qtdProd, insumos;

        System.out.println("SISTEMA DE CUSTO DE PROJETOS");
        System.out.print("Digite a quantidade de insumos pro projeto: ");
        insumos = input.nextInt();

        for (int loop = 1; loop <= insumos; loop++){
            System.out.print("\nInsira o nome do produto: ");
            nomePrd = input.nextLine();
            input.nextLine();
            System.out.print("Insira o custo unitário: ");
            precoUnit = input.nextDouble();
            System.out.print("Insira a quantidade de produtos: ");
            qtdProd = input.nextInt();

            precoTotal += precoUnit * qtdProd;
            mediaCusto = precoTotal / insumos;

            if (loop == 1 || precoTotal > prodCaro){
                prodCaro = precoTotal;
                nomeCaro = nomePrd;
            }
        }

        System.out.println("\nCusto total do projeto: "+precoTotal);
        System.out.println("Média dos custos: "+mediaCusto);
        System.out.println("Produto mais caro: "+nomeCaro);

        input.close();
    }
}
