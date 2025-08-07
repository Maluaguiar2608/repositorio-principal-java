//Crie uma classe Celular que, ao ser instanciada com o construtor padrão,
// tenha sempre marca = "Samsung" e preco = 1000.

public class Celular {
    String marca;
    double preco;

    public Celular(String marca_, double preco_){
        marca = marca_;
        preco = preco_;
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
    }
}
class PrincipalCelular{
    public static void main (String [] args){
        Celular c1 = new Celular("Samsung", 1000);
    }
}