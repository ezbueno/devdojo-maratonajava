package academy.devdojo.maratonajava.javacore.associacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = sc.nextInt();

        System.out.println("Digite M ou F para o seu sexo:");
        char sexo = sc.next().charAt(0);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
    }

}
