package academy.devdojo.maratonajava.javacore.interfaces.dominio;

public interface DataLoader {
    int MAX_SIZE = 10;

    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface DataLoader: MAX SIZE = " + MAX_SIZE);
    }
}
