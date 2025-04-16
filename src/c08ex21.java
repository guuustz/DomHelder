import java.util.*;
// by Gustavo Souza Reis
public class c08ex21 {
    public static void main(String[] args) {
        // calculates and classifies the BMI for weights from 60 to 100 based on the given height.
        Scanner input = new Scanner(System.in);

        double imc, altura;

        System.out.print("Insira sua altura: ");
        altura = input.nextDouble();

        for (int peso = 60; peso <= 100; peso++){

            imc = peso / Math.pow(altura, 2);

            if (imc < 20){
                System.out.printf("\n"+peso+" -  %.3f",imc," -  Abaixo do peso\n");
            } else if (imc > 20 && imc < 25) {
                System.out.printf("\n"+peso+" -  %.3f",imc," -  Peso ideal\n");
            } else
                System.out.printf("\n"+peso+" -  %.3f",imc," -  Acima do peso\n");
        }

        input.close();
    }
}
