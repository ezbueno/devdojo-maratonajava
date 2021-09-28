package academy.devdojo.maratonajava.javacore.associacao.teste;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTeste01 {

    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprimir();
    }

}
