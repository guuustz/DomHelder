import java.util.Scanner;
// by Gustavo Souza Reis
public class c04ex03 {
    public static void main(String[] args) {
        // program to calculate a fine based on the amount of pollutants emitted.
        long poluente;
        double multa;

        Scanner teclado = new Scanner(System.in);

        System.out.println("QUANTIDADE DE POLUENTE EMITIDO X VALOR DA MULTA");

        System.out.println("Digite o a quantidade de poluentes");
        poluente = teclado.nextLong();

        if (poluente <= 1500){
            multa = 1000.55;
            System.out.println("O valor da Multa será de: "+multa);
        }
        else if (poluente >= 1501 && poluente <= 3000){
            multa = 3550.34;
            System.out.println("O valor da Multa será de: "+multa);
        }
        else if (poluente >= 3001){
            multa = poluente * 1200.21;
            System.out.println("O valor da multa será de: "+multa);
        }

        teclado.close();
    }
}
