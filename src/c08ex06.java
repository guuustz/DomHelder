import java.util.*;
// by Gustavo Souza Reis
public class c08ex06 {
    public static void main(String[] args) {
        // program to classify numbers as even/odd, sum those divisible by 4, and count those divisible by 3
        Scanner input = new Scanner(System.in);

        int numero = 0, contPar, cont4 = 0, cont3 = 0;

        for (int loop = 1; loop <= 10; loop++){
            System.out.print("insira um número inteiro: ");
            numero = input.nextInt();

            if (numero % 2 == 0){
                System.out.println("este número é par\n");
            } else
                System.out.println("este número é impar\n");

            if (numero % 4 == 0){
                cont4 += numero;
            }

             if (numero % 3 == 0){
                cont3++;
            }

            if (numero == 0){
                break;
            }
        }

        System.out.println("Números: "+numero);
        System.out.println("Soma dos divisídeis por 4: "+cont4);
        System.out.println("Números divisíveis por 3: "+cont3);
        input.close();
    }
}
