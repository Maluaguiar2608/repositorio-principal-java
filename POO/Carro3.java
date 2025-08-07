// Crie uma classe Carro com os atributos marca e ano.
// Crie um construtor vazio que imprima "Carro criado".

public class Carro3 {
    String marca;
    int ano;

    public Carro3(){
        System.out.println("Carro criado.");
    }
}

class PrincipalCarro3{
    public static void main (String [] args){
        Carro3 c1 = new Carro3();
    }
}