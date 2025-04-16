import java.util.*;
import javax.swing.*;
// by Gustavo Souza Reis
public class c08ex11 {
    public static void main(String[] args) {
        // program to collect and analyze data on individuals, focusing on specific profiles, highest salary, and salary difference among men.
        Scanner input = new Scanner(System.in);

        int qtdPessoas, contLoiras = 0;
        double maiorSalario = 0;
        double maiorSalarioHomem = 0, menorSalarioHomem = 0, diffSalario = 0;
        String nomeSalario = "";

        String [] botoesSexo = {"Feminino", "Masculino"};
        String [] botoesEstado = {"Solteiro", "Casado", "Outros"};
        String [] botoesOlhos = {"Azul", "Castanhos", "Preto", "Outro"};
        String [] botoesCabelo = {"Loiro", "Preto", "Castanho", "Ruivo"};
        String [] botoesEscolaridade = {"Analfabeto", "Ensino Fundamental", "Ensino Médio", "Superior"};

        System.out.print("Selecione quantas pessoas serão entrevistadas: ");
        qtdPessoas = input.nextInt();

        for (int loop = 1; loop <= qtdPessoas; loop++){
            String nome = JOptionPane.showInputDialog(null,
                    "Insira seu nome",
                    "NOME",
                    JOptionPane.QUESTION_MESSAGE);

            String idade = JOptionPane.showInputDialog(null,
                    "Insira sua idade",
                    "IDADE",
                    JOptionPane.QUESTION_MESSAGE);
            int idadeInt = Integer.parseInt(idade);

            int sexo = JOptionPane.showOptionDialog(null,
                    "Selecione seu sexo",
                    "SEXO",
                    0,
                    1,
                    null,
                    botoesSexo,
                    botoesSexo[0]);

            int estadoCivil = JOptionPane.showOptionDialog(null,
                    "Selecione seu estado civil",
                    "ESTADO CIVIL",
                    0,
                    1,
                    null,
                    botoesEstado,
                    botoesEstado[0]);

            int corOlhos = JOptionPane.showOptionDialog(null,
                    "Selecione a cor dos seus olhos",
                    "COR DOS OLHOS",
                    0,
                    1,
                    null,
                    botoesOlhos,
                    botoesOlhos[0]);

            int corCabelo = JOptionPane.showOptionDialog(null,
                    "Selecione a cor do seu cabelo",
                    "COR DO CABELO",
                    0,
                    1,
                    null,
                    botoesCabelo,
                    botoesCabelo[0]);

            String salario = JOptionPane.showInputDialog(null,
                    "Insira o valor do seu salário",
                    "SALÁRIO",
                    JOptionPane.QUESTION_MESSAGE);
            double salarioDoub = Double.parseDouble(salario);

            int escolaridade = JOptionPane.showOptionDialog(null,
                    "Selecione seu grau de escolaridade",
                    "ESCOLARIDADE",
                    0,
                    1,
                    null,
                    botoesEscolaridade,
                    botoesEscolaridade[0]);

            if      (sexo == 0 &&
                    corCabelo == 0 &&
                    corOlhos == 0 &&
                    idadeInt >= 18 &&
                    idadeInt <= 25 &&
                    estadoCivil == 0 &&
                    salarioDoub > 10000 &&
                    escolaridade == 3){

                        contLoiras++;
            }

            if (salarioDoub > maiorSalario){
                maiorSalario = salarioDoub;
                nomeSalario = nome;
            }

            if (sexo == 1){
            } else if (salarioDoub > maiorSalarioHomem) {
                maiorSalarioHomem = salarioDoub;
            } else if (salarioDoub < menorSalarioHomem) {
                menorSalarioHomem = salarioDoub;
            }

            diffSalario = maiorSalarioHomem - menorSalarioHomem;
        }

                JOptionPane.showMessageDialog(null,
                "Mulheres loiras solteiras entre 18 e 25 anos que recebem mais de 10000 e possuem ensino completo : "+contLoiras,
                "RESULTADOS",
                JOptionPane.INFORMATION_MESSAGE);

                JOptionPane.showMessageDialog(null,
                "Pessoa com o maior salário: "+nomeSalario,
                "RESULTADOS",
                JOptionPane.INFORMATION_MESSAGE);

                JOptionPane.showMessageDialog(null,
                "Diferença entre o maior e o menor salário entre os homens: "+diffSalario,
                "RESULTADOS",
                JOptionPane.INFORMATION_MESSAGE);

        input.close();
    }
}
