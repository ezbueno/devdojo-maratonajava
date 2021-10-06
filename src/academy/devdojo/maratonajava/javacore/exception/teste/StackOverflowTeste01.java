package academy.devdojo.maratonajava.javacore.exception.teste;

public class StackOverflowTeste01 {

    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }

}
