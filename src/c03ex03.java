import java.util.Scanner; 
// by Gustavo Souza Reis
public class c03ex03 {
   public static void main(String[] args) {
     // program to calculate the hypotenuse of a right triangle using the Pythagorean Theorem.
     double hipotenusa, cateto1, cateto2;

     Scanner teclado = new Scanner(System.in);

     System.out.print("Informe o valor do cateto 1: ");
     cateto1 = teclado.nextDouble();

     System.out.print("Informe o valor do cateto 2 : ");
     cateto2 = teclado.nextDouble();

     hipotenusa = Math.pow(Math.pow(cateto1,2)+Math.pow(cateto2,2),1.0/2);

     System.out.print("Hipotenusa = "+hipotenusa);
     teclado.close();
   }
}