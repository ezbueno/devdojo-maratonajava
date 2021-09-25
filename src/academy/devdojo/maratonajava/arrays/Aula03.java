package academy.devdojo.maratonajava.arrays;

public class Aula03 {

    public static void main(String[] args) {
        int[] numeros = new int[3];
        numeros[0] = 15;
        numeros[1] = 26;
        numeros[2] = 52;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        int[] numeros2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        int[] numeros3 = new int[]{5, 4, 3, 2, 1};

        for (int num : numeros3) {
            System.out.println(num);
        }
    }

}
