package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Anime {
    private static final int[] episodios;

    static {
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {
        for (int episodio : episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
