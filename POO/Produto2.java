//Crie a classe Produto com atributos nome e preco.
// No construtor, se o preço for menor que 0, defina como 0.

public class Produto2 {
    String nome;
    double preco;

    public Produto2(String nome_,double preco_){
        nome = nome_;
        if(preco_ < 0){
            preco = 0;
        }else{
            preco = preco_;
        }
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}

class PrincipalProduto2{
    public static void main (String [] args){
        Produto2 p1 = new Produto2("Caneta",2.50);
        Produto2 p2 = new Produto2("Lápis", -5.00);
    }
}
