package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTeste01 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);

        pessoa.imprimir();
    }

}
