import java.util.*;
public class d26277C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char bolsa;
        int codigo, xeroxQtd;
        double valorProd, mensalidade = 0, descBolsa = 0, boleto, precoXerox, descMens;

        System.out.println("insira seu código de turma: ");
        codigo = input.nextInt();
        System.out.println("insira a qntd de xerox: ");
        xeroxQtd = input.nextInt();
        System.out.println("insira o valor dos produtos gastados: ");
        valorProd = input.nextDouble();
        System.out.println("você possui bolsa? [responda 's' para sim e 'n' para não]");
        bolsa = input.next().charAt(0);

        switch (codigo){
            case 1 -> mensalidade = 1200;
            case 2 -> mensalidade = 1350;
            case 3 -> mensalidade = 2100;
            case 4 -> mensalidade = 3200;
            default -> System.out.println("código inválido.");
        }

        if (bolsa == 'S' && codigo == 1){
            descBolsa = 0.05;
        }
            else if (bolsa == 'S' && codigo == 2){
                descBolsa = 0.1;
            }
                else if (bolsa == 'S' && codigo == 3) {
                    descBolsa = 0.15;
                }
                    else if (bolsa == 'S' && codigo == 4){
                        descBolsa = 0.3;
                    }
                        else if (bolsa == 'N'){
                            descBolsa = 0;
                        }

        if (xeroxQtd <= 50){
            precoXerox = 0.09;
        }
            else if (xeroxQtd > 51 && xeroxQtd <= 100) {
            precoXerox = 0.08;
        }
                else
                precoXerox = 0.06;

        descMens = mensalidade - (mensalidade * descBolsa);
        boleto = descMens + (xeroxQtd * precoXerox) + valorProd;

        System.out.println("seu boleto será de "+boleto);

        input.close();
    }
}
