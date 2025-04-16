// by Gustavo Souza Reis
public class c08ex26 {
    public static void main(String[] args) {
        // prints a pattern with spaces, forming a shape with
        // stars, first increasing then decreasing, repeated 10 times.
        for (int loop3 = 0; loop3 <= 10; loop3++) {
            for (int loop2 = 1; loop2 <= 10; loop2++) {
                for (int loop = 1; loop <= loop2; loop++){
                    System.out.print(" ");
            }
                System.out.println("*");
            }
            for (int loop2 = 10; loop2 >= 1; loop2--) {
                for (int loop = 1; loop <= loop2; loop++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
