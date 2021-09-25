package academy.devdojo.maratonajava.introducao.estruturascondicionais;

public class Aula06Exercicio {


    public static void main(String[] args) {
        int dia = 1;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }

        switch (dia) {
            case 1, 7 -> System.out.println("Final de Semana");
            case 2, 3, 4, 5, 6 -> System.out.println("Dia útil");
            default -> System.out.println("Opção inválida");
        }
    }
}
