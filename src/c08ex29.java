import java.util.Scanner;
// by Gustavo Souza Reis
public class c08ex29 {
    public static void main(String[] args) {
        // calculates the power of X raised to Y using a repeated multiplication loop.
        Scanner input = new Scanner(System.in);

        //declaracao de variaveis
        int x, y, funcao = 1;

        System.out.print("Insira o número X: ");
        x = input.nextInt(); //leitor x
        System.out.print("Insira o número Y: ");
        y = input.nextInt(); //leitor y

        //for para pegar a potenciacao
        for (int loop = 1; loop <= y;funcao *= x, loop++){
        }

        //print teste
        System.out.println(x+" elevado a "+y+" é igual a "+funcao);
        input.close();
    }
}
