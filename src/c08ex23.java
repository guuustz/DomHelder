import java.util.*;
// by Gustavo Souza Reis
public class c08ex23 {
    public static void main(String[] args) {
        // Calculates the average of all 4-digit palindromic numbers
        // (numbers that read the same forward and backward) between 1000 and 9999.
        Scanner input = new Scanner(System.in);

        int soma = 0, cont = 0;
        int numQ1, numQ2, numQ3, numQ4;
        double media = 0;

        for (int loop = 1000; loop <= 9999; loop++){
                    numQ1 = loop / 1000;
                    numQ2 = loop / 100 % 10;
                    numQ3 = loop / 10 % 10;
                    numQ4 = loop % 10;

                    if (numQ1 == numQ4 && numQ2 == numQ3){
                        cont++;
                        soma += loop;
                    }
                    if (cont > 0){
                        media = (double) soma/cont;
                    }

        }

        System.out.println("Média entre os palíndromos existentes [1000 --- 9999]: "+media);

        input.close();
    }
}
