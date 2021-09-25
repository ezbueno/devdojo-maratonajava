package academy.devdojo.maratonajava.introducao.estruturascondicionais;

public class Aula02 {

    public static void main(String[] args) {
        int idade = 17;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
