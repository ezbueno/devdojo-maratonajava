package academy.devdojo.maratonajava.javacore.heranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Salário: " + this.salario);
    }

    public void imprimirRelatorioPagamento() {
        System.out.println(this.nome + ", recebeu o salário no valor de R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
