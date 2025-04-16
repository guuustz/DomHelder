import java.util.*;
// by Gustavo Souza Reis
public class c07ex02 {
    public static void main(String[] args) {
        // program to calculate a student's average grade and assign a concept grade using a switch statement.
        Scanner input = new Scanner(System.in);

        int nota1, nota2, nota3, media;
        String nome;

        System.out.print("Insira seu nome: ");
        nome = input.nextLine();
        System.out.print("Insira sua nota 1: ");
        nota1 = input.nextInt();
        System.out.print("Insira sua nota 2: ");
        nota2 = input.nextInt();
        System.out.print("Insira sua nota 3: ");
        nota3 = input.nextInt();

        media = (nota1 + nota2 + nota3) / 3;

        switch (media){
            case 1, 2, 3, 4 -> System.out.println("Conceito: E");
            case 5, 6 -> System.out.println("Conceito: D");
            case 7 -> System.out.println("Conceito: C");
            case 8 -> System.out.println("Conceito: B");
            case 9, 10 -> System.out.println("Conceito: A");
            default -> System.out.println("Nota inválida. ");
        }

        input.close();
    }
}
