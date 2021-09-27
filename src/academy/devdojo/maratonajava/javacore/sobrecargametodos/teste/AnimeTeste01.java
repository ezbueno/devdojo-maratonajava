package academy.devdojo.maratonajava.javacore.sobrecargametodos.teste;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTeste01 {

    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.iniciar("Akudama Drive", "TV", 12);
        anime.iniciar("Akudama Drive", "TV", 12, "Ação");
        anime.imprimir();
    }

}
