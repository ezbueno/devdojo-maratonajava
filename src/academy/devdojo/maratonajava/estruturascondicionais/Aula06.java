package academy.devdojo.maratonajava.estruturascondicionais;

public class Aula06 {

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
