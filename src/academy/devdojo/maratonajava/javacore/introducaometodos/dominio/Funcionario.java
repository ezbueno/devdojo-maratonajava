package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Salário: ");

        if (this.salarios == null) {
            return;
        }

        for (double salario : this.salarios) {
            System.out.print(salario + " ");
        }

        this.imprimirMediaSalarial();
    }

    public void imprimirMediaSalarial() {
        if (this.salarios == null) {
            return;
        }

        double media = 0.0;

        for (double salario : this.salarios) {
            media += salario;
        }
        System.out.println("\nMédia salarial: " + media / this.salarios.length);
    }
}
