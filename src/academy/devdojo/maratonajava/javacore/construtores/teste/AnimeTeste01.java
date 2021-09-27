package academy.devdojo.maratonajava.javacore.construtores.teste;

import academy.devdojo.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTeste01 {

    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Ação", "Production IG");
        anime.imprimir();
    }

}
