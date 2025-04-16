import java.util.*;
// by Gustavo Souza Reis
public class c08ex14 {
    public static void main(String[] args) {
        // prints a square pattern with a given number of rows and columns, using a specified symbol.
        Scanner input = new Scanner(System.in);

        int num;
        String simbolo;
        System.out.print("insira um número: ");
        num = input.nextInt();
        input.nextLine();
        System.out.print("insira um símbolo: ");
        simbolo = input.nextLine();

        for (int loop = 0; loop < num; loop++) {
            for (int loop1 = 0; loop1 < num; loop1++) {
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
