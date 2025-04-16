import java.util.*;
// by Gustavo Souza Reis
public class c08ex04 {
    public static void main(String[] args) {
        // program to count how many users are ≤18 and >18, stopping input if name is "pause"
        Scanner input = new Scanner(System.in);

        int idade, cont1 = 0, cont2 = 0;
        String nome;

        for (int loop = 1; loop <= 50; loop++){
            System.out.print("insira seu nome: ");
            nome = input.nextLine();
            System.out.print("insira sua idade: ");
            idade = input.nextInt();
            input.nextLine();

            if (nome.equals("pause")){
                break;
            }
            if (idade <= 18){
                cont1++;
            }
            else
                cont2++;

        }

        System.out.println("Menores que 18: "+cont1);
        System.out.println("Maiores que 18: "+cont2);

        input.close();
    }
}
