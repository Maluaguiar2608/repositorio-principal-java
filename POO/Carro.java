//Crie uma classe Carro com os atributos: marca, modelo e ano.
// Crie um método que exibe as informações do carro. Instancie um objeto no main.


public class Carro{
    String marca;
    String modelo;
    int ano;

    void infoCarro(){

        System.out.println("Carro escolhido: ");
        System.out.println("\nMarca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
class PrincipalCarro{
    public static void main (String [] args){
        Carro c1 = new Carro();

        c1.marca = "Hyundai";
        c1.modelo = "Fit";
        c1.ano = 2025;

        c1.infoCarro();

    }
}
