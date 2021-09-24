package academy.devdojo.maratonajava.tiposprimitivos;

/**
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
 */

public class Aula03Exercicio {

    public static void main(String[] args) {
        String nome = "Ezandro";
        String endereco = "Rua Java";
        double salario = 5000.65;
        String dataRecebimentoSalario = "30/07/2021";
        String relatorio = "Eu " + nome + ", " + "morando no endereço " + endereco +
                ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }

}
