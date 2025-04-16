import java.util.*;
// by Gustavo Souza Reis
public class c08ex13 {
    public static void main(String[] args) {
        // analyzes city demographics: counts cities with over 1M people,
        // more women than men, and the city with the smallest population.
        Scanner input = new Scanner(System.in);
        Scanner arqv = new Scanner(c08ex13.class.getResourceAsStream("ibge.txt"));

        int cidades, eleitor, homens = 0, mulheres = 0, populacao = 0, contPop = 0, contMul = 0, menorPop = 0;
        String linhaC = "", linhaP, linhaE, linhaH, linhaM, nomeMenorcidade = "";

        System.out.print("Insira quantas cidades irão participar da pesquisa: ");
        cidades = input.nextInt();


        for (int loop = 1; loop <= cidades; loop++){
            linhaC = arqv.nextLine();
            System.out.println("\nCidade: "+linhaC);
            linhaP = arqv.nextLine();
            System.out.println("Popução: "+linhaP);
            linhaE = arqv.nextLine();
            System.out.println("Eleitores: "+linhaE);
            linhaH = arqv.nextLine();
            System.out.println("Homens: "+linhaH);
            linhaM = arqv.nextLine();
            System.out.println("Mulheres: "+linhaM);
            arqv.nextLine();

            populacao = Integer.parseInt(linhaP);
            eleitor = Integer.parseInt(linhaE);
            homens = Integer.parseInt(linhaH);
            mulheres = Integer.parseInt(linhaM);

            if (populacao != (homens + mulheres)){
                System.out.println("População != Homens + Mulheres\n");
            }

            if (populacao > 1000000){
                contPop++;
            }
            if (mulheres > homens) {
                contMul++;
            }
            if (loop == 1 || populacao < menorPop) {
                menorPop = populacao;
                nomeMenorcidade = linhaC;
            }
        }

        System.out.println("\nCidades com mais de 1 milhão de habitantes: "+contPop);
        System.out.println("Cidades com mais mulheres que homens: "+contMul);
        System.out.println("Cidade com menor população: "+nomeMenorcidade);

        arqv.close();
        input.close();
    }
}
