import java.util.*;
// by Gustavo Souza Reis
public class c08ex18 {
    public static void main(String[] args) {
        // prints the multiplication table of a given number from 1 to 9.
        Scanner input = new Scanner(System.in);

        int num, tabuada;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        for (int loop = 1; loop <= 9; loop++){
            tabuada = num * loop;
            System.out.println("Tabuada do "+num+":"+tabuada);
        }

        input.close();
    }
}
