import java.util.*;
// by Gustavo Souza Reis
public class c06ex12 {
    public static void main(String[] args) {
        // program to calculate the total cost of producing and storing soccer balls for the World Cup.
        Scanner input = new Scanner(System.in);

        double precoCaixasUnid, valorAluguel, totalAluguel, precoCaixasTotal, precoGalpao, custoTotal,totalCaixas;
        int bolasProd, bolasDef, bolasTotal, mesesCopa, totalGalpao;

        System.out.print("Quantas bolas a fábrica produziu: ");
        bolasProd = input.nextInt();
        System.out.print("Quantas bolas possuem defeito: ");
        bolasDef = input.nextInt();
        System.out.print("Qual o preço da unidade da caixa de papelão: ");
        precoCaixasUnid = input.nextDouble();
        System.out.print("Quantos meses faltam para a Copa do Mundo: ");
        mesesCopa = input.nextInt();
        System.out.print("Quanto é o aluguel mensal da fábrica: ");
        valorAluguel = input.nextInt();

        bolasTotal = bolasProd - bolasDef; //bolas

        totalCaixas = (int) (double) (bolasTotal / 10); //caixas
        precoCaixasTotal = precoCaixasUnid * totalCaixas; //caixas

        totalAluguel = valorAluguel * mesesCopa; //galpao
        totalGalpao = (int) Math.ceil(totalCaixas / 850); //galpao
        precoGalpao = totalGalpao * totalAluguel; //galpao

        custoTotal = precoGalpao + precoCaixasTotal; //final

        System.out.println("Valor da caixa(total): R$"+precoCaixasTotal);
        System.out.println("Valor total dos galpões: R$"+precoGalpao);
        System.out.println("-------------------------------------------");
        System.out.println("Custo total: R$"+custoTotal);


        input.close();
    }
}
