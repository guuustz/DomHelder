import java.util.*;
// by Gustavo Souza Reis
public class c08ex07 {
    public static void main(String[] args) {
        // program to collect names and ages, count people under 12 and over 30, and calculate the average age
        Scanner input = new Scanner(System.in);

        String nome;
        int idade, cont12 = 0, cont30 = 0, somaIdade = 0;
        double media = 0;

        for (int loop = 1; loop <= 50; loop++){
            System.out.print("nome: ");
            nome = input.nextLine();
            System.out.print("idade: ");
            idade = input.nextInt();
            input.nextLine();

            if (idade >= 1 && idade <= 12){
                cont12++;
            } else if (idade > 30) {
                cont30++;
            }

            if (nome.equals("Pause") && idade == 0){
                break;
            }

            somaIdade += idade;
            media = somaIdade / 50.0;
        }

        System.out.println("Menores que 12 anos: "+cont12);
        System.out.println("Maiores que 30 anos: "+cont30);
        System.out.println("Média de idade: "+media);

        input.close();
    }
}
