package academy.devdojo.maratonajava.javacore.heranca.teste;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTeste01 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("09878-899");

        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("123456789-00");
        pessoa.setEndereco(endereco);

        pessoa.imprimir();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("234909888-78");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        System.out.println("------------");

        funcionario.imprimir();

        System.out.println("------------");

        funcionario.imprimirRelatorioPagamento();
    }

}
