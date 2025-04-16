import java.util.Scanner;
// by Gustavo Souza Reis
public class c05ex11 {
    public static void main(String[] args) {
        // program to extract the bank, agency, and sequential number from a check number.
        Scanner teclado = new Scanner(System.in);

        int numCheque, banco, agencia, sequencial;

        System.out.print("Insira o número do cheque: ");
        numCheque = teclado.nextInt();

        banco = numCheque / 1000000;
        agencia = numCheque /1000 % 1000;
        sequencial = numCheque % 1000;

        System.out.println("No seu cheque, seu banco é "+banco+", sua agência é "+agencia+" e seu sequencial é "+sequencial);


        teclado.close();
    }
}
