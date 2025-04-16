import java.util.*;
//Múltiplos de 3 e 5
public class ex001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, soma = 0, i;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        for (i = 0; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                soma += i;
            }
        }

        System.out.println("Dentro do número "+num+" a soma dos múltiplos de 3 e 5 é de "+soma+".");

        input.close();
    }
}
