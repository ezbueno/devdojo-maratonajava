package academy.devdojo.maratonajava.javacore.classesabstratas.teste;

import academy.devdojo.maratonajava.javacore.classesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(desenvolvedor);

        gerente.imprimir();
        desenvolvedor.imprimir();
    }

}
