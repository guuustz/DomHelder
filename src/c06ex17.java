import java.util.*;
// by Gustavo Souza Reis
public class c06ex17 {
    public static void main(String[] args) {
        // program to evaluate aptitude for becoming a programmer based on a series of true/false questions.
        Scanner input = new Scanner(System.in);

        boolean perg1, perg2, perg3, perg4, perg5, perg6, perg7, perg8, perg9;

        System.out.println("TESTE DE APTIDÃO PARA SER UM PROGRAMADOR.");
        System.out.println("Por favor, responda todas as perguntas apenas com V ou F");

        System.out.println("---------------------------------------");

        System.out.println("Você tem curso técnico de programação? ");
        perg1 = input.next().equalsIgnoreCase("V");
        System.out.println("Você tem curso superior de programação? ");
        perg2 = input.next().equalsIgnoreCase("V");
        System.out.println("Você tem menos de 3 anos de experiência em programação? ");
        perg3 = input.next().equalsIgnoreCase("V");
        System.out.println("Você se considera uma pessoa criativa? ");
        perg4 = input.next().equalsIgnoreCase("V");
        System.out.println("Você prefere liderar a ser liderado? ");
        perg5 = input.next().equalsIgnoreCase("V");
        System.out.println("Você prefere trabalhar sozinho a trabalhar em equipe? ");
        perg6 = input.next().equalsIgnoreCase("F");
        System.out.println("Você é autodidata (aprende sozinho)? ");
        perg7 = input.next().equalsIgnoreCase("V");
        System.out.println("Você aceitaria uma remuneração inicial de R$1500? ");
        perg8 = input.next().equalsIgnoreCase("V");
        System.out.println("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
        perg9 = input.next().equalsIgnoreCase("F");

        boolean aptidao = true;

        if (perg1  && !perg2  && !perg3){
            aptidao = false;
        } else if (!perg4) {
            aptidao = false;
        } else if (perg5 && !perg8){
            aptidao = false;
        } else if (!perg6) {
            aptidao = false;
        } else if (!perg7) {
            aptidao = false;
        } else if (!perg9) {
            aptidao = false;
        }

        if (aptidao){
            System.out.println("Você está apto para ser um programador!!!!!");
        }
        else{
            System.out.println("Você NÃO está apto para ser um programador.....");
        }

        input.close();
    }
}
