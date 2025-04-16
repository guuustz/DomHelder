import java.util.*;
// by Gustavo Souza Reis
public class c08ex16 {
    public static void main(String[] args) {
        // calculates the average of odd numbers between 1000 and 2000.
        Scanner input = new Scanner(System.in);

        int impares = 0;
        double media, contImp = 0;

        for (int loop = 1000; loop <= 2000; loop++){
            if (loop % 2 == 1){
                contImp++;
                impares += loop;
            };
        }

        media = impares / contImp;
        System.out.println("A média de números impares entre 1000 e 2000 é de: "+media);

        input.close();
    }
}
