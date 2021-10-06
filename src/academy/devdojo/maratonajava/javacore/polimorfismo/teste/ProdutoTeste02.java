package academy.devdojo.maratonajava.javacore.polimorfismo.teste;

import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class ProdutoTeste02 {

    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + produto.calcularImposto());

        System.out.println("---------------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Valor: " + produto2.getValor());
        System.out.println("Imposto a ser pago: " + produto2.calcularImposto());
    }

}
