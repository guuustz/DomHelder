import java.util.*;
// by Gustavo Souza Reis
public class c06ex16 {
    public static void main(String[] args) {
        // program to calculate a student's final grade and performance based on absences,
        // age, top two test scores, and a final project.
        Scanner input = new Scanner(System.in);

        int faltas, idade, peso1 = 0, peso2 = 0;
        double prova1, prova2, prova3, trabalhoFinal, notaFinal, situacao;
        double maior1, maior2;

        System.out.print("Insira quantas faltas você teve: ");
        faltas = input.nextInt();
        System.out.print("Insira sua nota da prova 1: ");
        prova1 = input.nextDouble();
        System.out.print("Insira sua nota da prova 2: ");
        prova2 = input.nextDouble();
        System.out.print("Insira sua nota da prova 3: ");
        prova3 = input.nextDouble();
        System.out.print("Insira sua nota do trabalho final: ");
        trabalhoFinal = input.nextDouble();
        System.out.print("Insira sua idade: ");
        idade = input.nextInt();

        if (faltas < 5){
            peso1 = 3;
        } else if (faltas > 5 && faltas < 10) {
            peso1 = 2;
        } else if (faltas > 10) {
            peso1 = 1;
        }

        if (idade <= 17){
            peso2 = 1;
        } else if (idade > 18 && idade < 50) {
            peso2 = 2;
        } else if (idade > 50) {
            peso2 = 3;
        }

        if (prova1 > prova2 && prova1 > prova3){
            maior1 = prova1;
            maior2 = (prova2 > prova3) ? prova2 : prova3;
        } else if (prova2 > prova1 && prova2 > prova3){
            maior1 = prova2;
            maior2 = (prova1 > prova3) ? prova1 : prova3;
        } else {
            maior1 = prova3;
            maior2 = (prova1 > prova2) ? prova1 : prova2;
        }

        notaFinal = (((maior1 + maior2)*peso1) / peso1) + (trabalhoFinal * peso2);

        if (notaFinal < 50){
            System.out.println("Você está REPROVADO. Nota final: "+notaFinal);
        } else if (notaFinal > 50 && notaFinal < 70) {
            System.out.println("Você está aprovado. Rendimento REGULAR. Nota final: "+notaFinal);
        } else if (notaFinal > 70 && notaFinal < 80) {
            System.out.println("Você está aprovado. Rendimento BOM. Nota final: "+notaFinal);
        } else if (notaFinal > 80 && notaFinal < 90) {
            System.out.println("Você está aprovado. Rendimento MUITO BOM. Nota final: "+notaFinal);
        } else if (notaFinal > 90) {
            System.out.println("Você está aprovado. Rendimento EXCELENTE. Nota final: "+notaFinal);
        }


        input.close();
    }
}
