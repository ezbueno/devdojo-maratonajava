package academy.devdojo.maratonajava.javacore.exception.runtime.teste;

public class RuntimeExceptionTeste02 {

    public static void main(String[] args) {
        try {
            System.out.println(dividir(1, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }

}
