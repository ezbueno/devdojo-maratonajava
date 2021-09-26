package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alterarDoisNumeros(num1, num2);
        System.out.println("Dentro do CalculadoraTeste04");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

}
