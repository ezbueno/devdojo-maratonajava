package academy.devdojo.maratonajava.introducao.estruturascondicionais;

public class Aula03 {

    public static void main(String[] args) {
        double salario = 6000;
        String resultado;

        resultado = salario > 5000 ? "Eu vou doar R$ 500 para o DevDojo" : "Ainda não tenho condições, mas vou ter!";
        System.out.println(resultado);
    }
}
