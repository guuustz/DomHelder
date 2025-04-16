import java.util.*;
public class d26277A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, fx;

        System.out.print("insira o valor de x para calcular a função fx: ");
        x = input.nextDouble();

        fx = ((5 * x - 3) / (Math.pow((x - 1), 1.0/7))) + (6 * x) - (1.0/7);

        System.out.println("a função fx será "+fx);

        input.close();
    }
}
