package academy.devdojo.maratonajava.javacore.interfaces.teste;

import academy.devdojo.maratonajava.javacore.interfaces.dominio.DataLoader;
import academy.devdojo.maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.interfaces.dominio.FileLoader;

public class DataLoaderTeste01 {

    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }

}
