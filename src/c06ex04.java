import java.util.Scanner;
// by Gustavo Souza Reis
public class c06ex04 {
    public static void main(String[] args) {
        // program to calculate the BMI (Body Mass Index) and provide a weight category based on the result.
        Scanner teclado = new Scanner(System.in);

        String nome;
        double altura, peso, imc;

        System.out.print("Insira seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Insira sua altura em metros: ");
        altura = teclado.nextDouble();
        System.out.print("Insira seu peso em kilos: ");
        peso = teclado.nextDouble();

        imc = peso/Math.pow(altura,2);
        System.out.println("Seu IMC é de: "+imc);

        if (imc < 18){
            System.out.println("Atenção "+nome+"! Você está desnutrido!");
        } else if (imc >18 && imc <20) {
            System.out.println("Atenção! Você está abaixo do peso!");
        } else if (imc > 20 && imc < 25) {
            System.out.println("Você está no peso ideal!");
        } else if (imc > 25 && imc < 27) {
            System.out.println("Atenção! Você está acima do peso!");
        } else if (imc > 27) {
            System.out.println("Atenção! Você está obeso!");
        }
        teclado.close();
    }
}
