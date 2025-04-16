import java.util.*;
// by Gustavo Souza Reis
public class c06ex13 {
    public static void main(String[] args) {
        // program to calculate the duration between two given times, adjusting for minutes overflow.
        Scanner input = new Scanner(System.in);

        int hrInicial, hrFinal, minInicial, minFinal;
        int duracaoHr, duracaoMin;

        System.out.print("DIGITE AS HORAS INICIAIS: ");
        hrInicial = input.nextInt();
        System.out.print("DIGITE OS MINUTOS INICIAIS: ");
        minInicial = input.nextInt();
        System.out.print("DIGITE AS HORAS FINAIS: ");
        hrFinal = input.nextInt();
        System.out.print("DIGITE OS MINUTOS FINAIS: ");
        minFinal = input.nextInt();

        duracaoHr = hrFinal - hrInicial;
        duracaoMin = minFinal - minInicial;
        if (minFinal < minInicial){
            duracaoHr = (hrFinal - 1) - hrInicial;
            duracaoMin = (minFinal + 60) - minInicial;
        }
        System.out.println("-------------------------------------");
        System.out.println("A duração foi de "+duracaoHr+"hrs e de "+duracaoMin+"min.");

        input.close();
    }
}
