package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Sanji";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{1200, 987.32, 2000};
        funcionario.imprimir();
    }

}
