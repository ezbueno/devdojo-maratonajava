package academy.devdojo.maratonajava.javacore.polimorfismo.dominio;

public abstract class Produto implements Taxa {
    protected String nome;
    protected double valor;

    protected Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
