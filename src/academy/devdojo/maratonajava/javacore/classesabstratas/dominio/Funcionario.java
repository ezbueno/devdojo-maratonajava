package academy.devdojo.maratonajava.javacore.classesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    protected Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.calcularBonus();
    }

    public abstract void calcularBonus();
}
