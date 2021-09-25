package academy.devdojo.maratonajava.introducao.estruturasderepeticao;

public class Aula05Exercicio {

    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela = 0;

        for (double parcela = (int) valorCarro; parcela >= 1; parcela--) {
            valorParcela = valorCarro / parcela;

            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " = R$ " + valorParcela);
        }
    }

}
