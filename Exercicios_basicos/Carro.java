//Crie uma classe chamada Carro com os atributos:
//marca (String)
//ano (int)
//No main, crie dois carros diferentes e imprima as informações deles.


package Exercícios_iniciais;

public class Carro {
    String marca;
    int ano;

    public void receberInfo(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public static void main (String [] args){
        Carro carro1 = new Carro();
        carro1.receberInfo("Hyundai", 2010);

        Carro carro2 = new Carro();
        carro2.receberInfo("Fiesta", 1950);

        System.out.println("Carro 1: ");
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Ano: " + carro1.ano);

        System.out.println("Carro 2: ");
        System.out.println("Marca: " + carro2.marca);
        System.out.println("Ano: " + carro2.ano);
    }
}
