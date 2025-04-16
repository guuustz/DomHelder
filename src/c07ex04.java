import java.util.*;
// by Gustavo Souza Reis
public class c07ex04 {
    public static void main(String[] args) {
        // program to identify the state of a Brazilian football team based on its name using a switch statement.
        Scanner input = new Scanner(System.in);

        String equipe;

        System.out.println("Insira o nome da equipe: ");
        equipe = input.nextLine();

        switch (equipe){
            case "América", "Cruzeiro", "Atlético", "Villa Nova" -> System.out.println("O "+equipe+" é de Minas Gerais.");
            case "Botafogo", "Flamengo", "Fluminense", "Vasco" -> System.out.println("O "+equipe+" é de Rio de Janeiro.");
            case "Santos", "São Paulo", "Palmeiras", "Corinthians" -> System.out.println("O "+equipe+" é de São Paulo.");
            case "Grêmio", "Internacional", "Juventude" -> System.out.println("O "+equipe+" é do Rio Grande do Sul.");
            case "Náutico", "Santa Cruz", "Sport" -> System.out.println("O "+equipe+" é de Pernambuco.");
            default -> System.out.println("Insira outro nome de equipe.");
        }

        input.close();
    }
}
