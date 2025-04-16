import java.util.*;
// by Gustavo Souza Reis
public class c06ex14 {
    public static void main(String[] args) {
        // program to reverse a 4-digit number's digits.
        Scanner input = new Scanner(System.in);

        int num;
        int numDec1, numDec2, numDec3, numDec4;
        System.out.print("Digite um número: ");
        num = input.nextInt();

        if (num < 1000){
            System.out.println("O NÚMERO TEM QUE TER 4 DÍGITOS!!!");
        }
        else if (num > 9999) {
            System.out.println("O NÚMERO TEM QUE TER 4 DÍGITOS!!!");
        }

        numDec1 = num/1000;
        numDec2 = (num/100)%10;
        numDec3 = (num/10)%10;
        numDec4 = num%10;

        System.out.println(numDec4+""+numDec3+""+numDec2+""+numDec1);

        input.close();
    }
}
