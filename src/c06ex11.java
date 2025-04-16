import java.util.*;
// by Gustavo Souza Reis
public class c06ex11 {
    public static void main(String[] args) {
        // program to calculate and display the points based on sets won by two teams.
        Scanner input = new Scanner(System.in);

        String time1, time2;
        int setsTime1, setsTime2;

        System.out.print("Insira o nome da equipe 1: ");
        time1 = input.nextLine();
        System.out.print("Insira quantos sets a equipe 1 ganhou: ");
        setsTime1 = input.nextInt();
        System.out.print("Insira o nome da equipe 2: ");
        input.nextLine();
        time2 = input.nextLine();
        System.out.print("Insira quantos sets a equipe 2 ganhou: ");
        setsTime2 = input.nextInt();

        if (setsTime1 == 3 && setsTime2 <= 1){
            System.out.println("O "+time1+" ganhou de 3 sets a "+setsTime2+". Ganhando assim, 3 pts.");
        }
        else if (setsTime1 == 3 && setsTime2 == 2) {
            System.out.println("O "+time1+" ganhou de 3 sets a "+setsTime2+". Ganhando assim, 2 pts.");
        }

        if (setsTime2 == 3 && setsTime1 <= 1){
            System.out.println("O "+time2+" ganhou de 3 sets a "+setsTime1+". Ganhando assim, 3 pts.");
        }
        else if (setsTime2 == 3 && setsTime1 == 2) {
            System.out.println("O "+time2+" ganhou de 3 sets a "+setsTime1+". Ganhando assim, 2 pts.");
        }

        input.close();
    }
}
