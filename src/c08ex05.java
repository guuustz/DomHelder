import java.util.*;
// by Gustavo Souza Reis
public class c08ex05 {
    public static void main(String[] args) {
        // program to tally votes for 3 candidates and declare the winner (0 ends voting)
        Scanner input = new Scanner(System.in);

        int votos, cont1 = 0, cont2 = 0, cont3 = 0;
        String vencedor;

        System.out.println("digite 1 para fulano");
        System.out.println("digite 2 para ciclano");
        System.out.println("digite 3 para beltrano");

        for (int loop = 1; loop <= 100; loop++){
            System.out.print("insira seu voto: ");
            votos = input.nextInt();

            switch (votos){
                case 1 -> cont1++;
                case 2 -> cont2++;
                case 3 -> cont3++;
                default -> System.out.println("insira um número correto");
            }

            if (votos == 0){
                break;
            }
        }

        if (cont1 > cont2 && cont1 > cont3){
            vencedor = "Fulano";
        } else if (cont2 > cont1 && cont2> cont3){
            vencedor = "Ciclano";
        } else
            vencedor = "Beltrano";

        System.out.println("votos do fulano: "+cont1);
        System.out.println("votos do ciclano: "+cont2);
        System.out.println("votos do beltrano:"+cont3);
        System.out.println("O vencedor é "+vencedor+".");

        input.close();
    }
}
