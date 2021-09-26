package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicarDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimirDivisaoDeDoisNumeros(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alterarDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alterarDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somarArray(int[] numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somarVarArgs(int... numeros) {
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

}
