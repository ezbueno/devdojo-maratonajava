package academy.devdojo.maratonajava.javacore.introducaometodos.teste;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dividirDoisNumeros(20, 2));
        System.out.println("------------");
        calculadora.imprimirDivisaoDeDoisNumeros(86, 0);
    }

}
