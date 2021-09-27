package academy.devdojo.maratonajava.javacore.blocosinicializacao.teste;

import academy.devdojo.maratonajava.javacore.blocosinicializacao.dominio.Anime;

public class AnimeTeste01 {

    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }

}
