package academy.devdojo.maratonajava.estruturasderepeticao;

public class Aula14Exercicio {

    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela = 0;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " = R$ " + valorParcela);
        }
    }

}
