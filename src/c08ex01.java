import java.util.*;
// by Gustavo Souza Reis
public class c08ex01 {
    public static void main(String[] args) {
        // program to calculate and display the area of 10 circles based on user-inputted radii.
        Scanner input = new Scanner(System.in);

        double area, pi, raio;

        pi = 3.1416;

        for (int rept = 1; rept <= 10; rept++) {
            System.out.println("\ninsira 10 valores para raios de círculos.");
            raio = input.nextDouble();

            area = pi * Math.pow(raio, 2);

            System.out.println("Raio: "+raio+"\nÁrea: "+area);
        }

        input.close();
    }
}
