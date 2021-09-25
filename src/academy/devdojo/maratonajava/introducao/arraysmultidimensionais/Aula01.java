package academy.devdojo.maratonajava.introducao.arraysmultidimensionais;

public class Aula01 {

    public static void main(String[] args) {
        int[][] numeros = new int[3][3];
        numeros[0][0] = 4;
        numeros[0][1] = 16;
        numeros[0][2] = 89;
        numeros[1][0] = 45;
        numeros[1][1] = 66;
        numeros[1][2] = 12;
        numeros[2][0] = 78;
        numeros[2][1] = 104;
        numeros[2][2] = 976;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }

        System.out.println("-----------");

        for (int[] arrBase : numeros) {
            for (int num : arrBase) {
                System.out.println(num);
            }
        }
    }

}
