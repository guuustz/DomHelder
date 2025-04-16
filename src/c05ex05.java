import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex05 {
    public static void main(String[] args) {
        // program to convert a temperature from Celsius to Kelvin and Fahrenheit.
        Scanner teclado = new Scanner(System.in);

        double celsius, kelvin, fahrenheit;

        System.out.println("Bem vindo ao programa de conversão de temperaturas!");
        System.out.print("Digite um valor em Celsius: ");
        celsius = teclado.nextDouble();

        kelvin = celsius + 273;
        fahrenheit = (celsius * 9 + 160)/5;

        System.out.println("Seu valor de Celsius em Kelvin é "+kelvin+ "K e em Farenheit é "+fahrenheit+"F");


        teclado.close();
    }
}
