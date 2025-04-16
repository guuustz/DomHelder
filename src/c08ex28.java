// by Gustavo Souza Reis
public class c08ex28 {
    public static void main(String[] args) {
        // calculates and prints triangular numbers less than or equal to 1000,
        // sums them, and calculates the average of these numbers.
        //variaveis em geral
        int cont = 0, media = 0, soma = 0;

        //for pegando os numeros em seq
        for (int loop = 1; loop * (loop + 1 ) * (loop + 2) <= 1000; loop++){
            int num = loop * (loop + 1) * (loop + 2); //num = numeros triangulares, loop = multplc em seq
            System.out.print(num+", "); // printar os nums
            soma += num; // somatoria dos numeros para media
            cont++; //qtd de numeros que sao triangulares
            media = soma / cont; //media final
        }
        //print teste
        System.out.println("\nMédia: "+media);
    }
}
