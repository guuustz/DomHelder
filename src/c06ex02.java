import java.util.Scanner;
// by Gustavo Souza Reis
public class c06ex02 {
    public static void main(String[] args) {
        // program to calculate the fine based on the amount of pollutants emitted.
        double multa, poluente;
        Scanner teclado = new Scanner(System.in);
        System.out.println("QUANTIDADE DE POLUENTE EMITIDO X VALOR DA MULTA");
        System.out.print("Digite o a quantidade de poluentes: ");
        poluente = teclado.nextDouble();

        if (poluente <= 1500){
            multa = 0;
            System.out.println("Valor da multa: R$"+multa);
        }
        else if (poluente >= 1501 && poluente <= 3000){
            multa = 3000.00;
            System.out.println("Valor da multa: R$"+multa);
        }
        else if (poluente >= 3001){
            multa = 5000 * poluente;
            System.out.println("Valor da multa: R$"+multa);
        }

        teclado.close();
    }
}
