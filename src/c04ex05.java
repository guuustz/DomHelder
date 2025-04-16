import java.util.Scanner;
// by Gustavo Souza Reis
public class c04ex05 {
    public static void main(String[] args) {
        // program to read and display employee data from a text file.
        String linha;
        Scanner arquivo = new Scanner(c04ex05.class.getResourceAsStream("ficha1.txt"));

        linha = arquivo.nextLine();
        System.out.println("FICHA FUNCIONAL DE: "+linha);
        System.out.println("\nDOCUMENTOS: ");
        linha = arquivo.nextLine();
        System.out.println("\nCPF..........................."+linha);
        linha = arquivo.nextLine();
        System.out.println("C.I..........................."+linha);
        linha = arquivo.nextLine();
        System.out.println("Título de eleitor............."+linha);
        linha = arquivo.nextLine();
        System.out.println("CHN..........................."+linha);
        linha = arquivo.nextLine();
        System.out.println("\nEmpresa......................."+linha);
        linha = arquivo.nextLine();
        System.out.println("Salário.......................R$"+linha);
        arquivo.close();
    }
}
