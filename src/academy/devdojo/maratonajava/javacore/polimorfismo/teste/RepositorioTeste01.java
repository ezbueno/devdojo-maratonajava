package academy.devdojo.maratonajava.javacore.polimorfismo.teste;

import academy.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioBancoDados;

public class RepositorioTeste01 {

    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDados();
        repositorio.salvar();
    }

}
