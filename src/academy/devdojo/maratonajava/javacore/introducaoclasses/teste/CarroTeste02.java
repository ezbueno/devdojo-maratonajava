package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTeste02 {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Golf";
        carro.modelo = "GTI";
        carro.ano = 1999;

        carro2.nome = "Punto";
        carro2.modelo = "T-jet";
        carro2.ano = 2015;

        carro = carro2;

        System.out.println("Nome: " + carro.nome + " Modelo: " + carro.modelo + " Ano: " + carro.ano);
        System.out.println("Nome: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }

}
