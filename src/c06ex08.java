import java.util.*;
// by Gustavo Souza Reis
public class c06ex08 {
    public static void main(String[] args) {
        // program to calculate the minimum and maximum healthy weight based on height using the BMI formula.
        Scanner input = new Scanner(System.in);

        String nome;
        double altura, imcMin, imcMax, pesoMin, pesoMax;

        System.out.print("Insira seu nome: ");
        nome = input.nextLine();
        System.out.print("Insira sua altura: ");
        altura = input.nextDouble();

        imcMin = 20.0;
        imcMax = 25.0;

        pesoMin = imcMin * Math.pow(altura,2);
        pesoMax = imcMax * Math.pow(altura,2);

        System.out.println(nome+" Seu peso mínimo é "+pesoMin);
        System.out.println("Seu peso máximo é "+pesoMax);


        input.close();
    }
}
