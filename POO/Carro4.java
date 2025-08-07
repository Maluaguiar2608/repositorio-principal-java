//Classe Carro com modelo e ano.
// Cadastre 3 carros e imprima apenas os com ano maior que 2015.

public class Carro4 {
    String modelo;
    int ano;

    public Carro4(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }
}

class PrincipalCarro4{
    public static void main (String [] args){
        Carro4 [] carros = new Carro4[3];

        carros[0] = new Carro4("Fiat", 2024);
        carros[1] = new Carro4("Jeep", 2025);
        carros[2] = new Carro4("Ford", 2005);

        System.out.println("Carros com o ano acima de 2015:");
        for(int i = 0; i < carros.length; i++){
            if(carros[i].ano > 2015){
                System.out.println("Modelo: " + carros[i].modelo);
            }
        }
    }
}
