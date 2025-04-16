// by Gustavo Souza Reis
public class c08ex25 {
    public static void main(String[] args) {
        // prints a pattern of stars first increasing and then decreasing in size, repeated 10 times.
        for (int loop3 = 1; loop3 <= 10; loop3++) {
            for (int loop2 = 1; loop2 <= 10; loop2++) {
                for (int loop = 1; loop <= loop2; loop++)
                    System.out.print("*");
                System.out.println();
            }
            for (int loop2 = 10; loop2 >= 1; loop2--) {
                for (int loop = 1; loop <= loop2; loop++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
