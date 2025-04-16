import java.util.*;
// by Gustavo Souza Reis
public class c08ex31 {
    public static void main(String[] args) {
        // collects data from engineers to calculate the number of engineers with
        // a minimum salary, the average salary of administrators, and the lowest salary among all engineers.
        Scanner input = new Scanner(System.in);

        // variaveis em geral
        String nome, cargo = "";
        int codigo, engenheiros, contEng = 0, contOut = 0, contAdm = 0;
        double salarioBru, salarioMin = 0, somaAdm = 0, mediaAdm = 0;

        //variaveis menor salario
        String nomeMen = "", cargoMen = "";
        double salarioMen = 0;

        //numero de entrevistados
        System.out.print("Insira o número de engenheiros entrevistados: ");
        engenheiros = input.nextInt();

        //for baseado no num de entrevistados
        for (int loop = 1; loop <= engenheiros; loop++) {
            input.nextLine(); // pulando linha p nao bugar o codigo
            System.out.print("\nInsira seu nome: ");
            nome = input.nextLine(); //leitor nome
            System.out.print("Insira seu salário bruto: ");
            salarioBru = input.nextDouble(); // leitor sal bruto
            System.out.println("1. Engenheiro Calculista;" +
                    "\n2. Engenheiro Projetista;" +
                    "\n3. Engenheiro de Obra;" +
                    "\n4. Engenheiro Administrador;" +
                    "\n5. Outros." +
                    "\nInsira seu código de cargo: ");
            codigo = input.nextInt(); // leitor codigo

            //switch codigo
            switch (codigo){
                case 1 -> {salarioMin = 2500; cargo = "Engenheiro Calculista";}
                case 2 -> {salarioMin = 4650; cargo = "Engenheiro Projetista";}
                case 3 -> {salarioMin = 3200; cargo = "Engenheiro de Obra";}
                case 4 -> {salarioMin = 5100; cargo = "Engenheiro Administrador";}
                case 5 -> {salarioMin = 0; cargo = "Outro";}
            }

            //if para abaixo do salario minimo
            if (salarioBru < salarioMin && codigo != 5){
                System.out.println("ABAIXO DO SALÁRIO MÍNIMO\n");
            } else if (salarioBru > salarioMin && codigo != 5) // else para contar eng acima do sal
                contEng++;

            //if para contar os adm e suas medias
            if (codigo == 4){
                contAdm++;
                somaAdm += salarioBru;
                mediaAdm = somaAdm / contAdm;
            }

            //if para contar sal dos out acima de 5000
            if (codigo == 5 && salarioBru > 5000){
                contOut++;
            }

            //if para o menor salario
            if (loop == 1 || salarioBru < salarioMen){
                salarioMen = salarioBru;
                nomeMen = nome;
                cargoMen = cargo;
            }

            }

        //prints dos testes finais
        System.out.println("\nQuantidade de engenheiros com salário igual ou acima do mínimo: "+contEng);
        System.out.printf("Média dos administradores: %.2f",mediaAdm);
        System.out.println("\nQuantidade de engenheiros de outros cargos que recebem acima de 5000: "+contOut);
        System.out.println("Quem recebe o menor salário é "+nomeMen+", que é "+cargoMen+", ganhando "+salarioMen);

        input.close();
        }


    }

