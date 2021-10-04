package academy.devdojo.maratonajava.javacore.enums.teste;

import academy.devdojo.maratonajava.javacore.enums.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.enums.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.enums.dominio.TipoPagamento;

public class ClienteTeste01 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());

        TipoCliente tipoCliente2 = TipoCliente.gerarRelatorioPorNome("Pessoa Física");
        System.out.println(tipoCliente2);
    }

}
