package academy.devdojo.maratonajava.estruturasderepeticao;

public class Aula13Exercicio {

    public static void main(String[] args) {
        int valorMax = 50;

        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }

}
