import java.util.*;
// by Gustavo Souza Reis
public class c08ex22 {
    public static void main(String[] args) {
        // checks if a number is prime by dividing it by all numbers up to its square root.
        Scanner input = new Scanner(System.in);

        int num;
        boolean primo = true;

        System.out.print("Insira um número: ");
        num = input.nextInt();

        for (int loop = 2; loop <= Math.sqrt(num); loop++){
            if (num % loop == 0){
                primo = false;
                break;
            }
        }

        if (primo){
            System.out.println("Este número é primo");
        } else
            System.out.println("Este número NÃO é primo");

        input.close();
    }
}
