// by Gustavo Souza Reis
public class c08ex27 {
    public static void main(String[] args) {
        // prints a pattern of stars forming a pyramid shape that
        // increases and then decreases in size, using powers of 2 for each row, repeated twice.
        for (int loop3 = 1; loop3 <= 2; loop3++) { //for para a contagem
            for (int loop2 = 1; loop2 <= 8; loop2++) { // for de dentro para descer
                int prog = (int) Math.pow(2, loop2 - 1); //progressao dos *
                for (int loop = 1; loop <= prog; loop++){ //for pra preencer
                    System.out.print("*"); //print
                }
                System.out.println();
            }
            for (int loop2 = 7; loop2 >= 1; loop2--) { //for para a descida
                int prog = (int) Math.pow(2, loop2 - 1);//prog dnv
                for (int loop = 1; loop <= prog; loop++){//for pra preencher
                    System.out.print("*"); // print
                }
                System.out.println();
            }
        }
    }
}
