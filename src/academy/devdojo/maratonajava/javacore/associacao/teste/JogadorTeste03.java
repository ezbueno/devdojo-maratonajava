package academy.devdojo.maratonajava.javacore.associacao.teste;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Time;

public class JogadorTeste03 {

    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprimir();

        System.out.println("--- Time ---");
        time.imprimir();
    }

}
