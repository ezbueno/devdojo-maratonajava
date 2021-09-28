package academy.devdojo.maratonajava.javacore.associacao.teste;

import java.util.Scanner;

public class LeituraDoTecladoTeste02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro");
        System.out.println("Digite a sua pergunta e eu responderei 'SIM' ou 'NÃO'");
        String pergunta = sc.nextLine();

        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

    }

}
