package academy.devdojo.maratonajava.javacore.exception.runtime.teste;

public class RuntimeExceptionTeste03 {

    public static void main(String[] args) {
        abrirConexao();
        abrirConexao2();
    }

    private static String abrirConexao() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abrirConexao2() {
        try {
            System.out.println("Abrindo o arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }

}
