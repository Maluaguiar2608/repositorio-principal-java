//Crie uma classe Produto com nome e preço.
// Armazene 3 produtos em um array e imprima os dados

public class Produto3 {
    String nome;
    double preco;

    public Produto3(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}

class PrincipalProduto3{
    public static void main (String [] args){
        Produto3 [] produtos = new Produto3 [5];

        produtos[0] = new Produto3("Caneta", 2.50);
        produtos[1] = new Produto3("Caderno", 54.00);
        produtos[2] = new Produto3("Lápis", 1.50);
        produtos[3] = new Produto3("Mouse",35.00);
        produtos[4] = new Produto3("Garrafa", 50.00);

        double soma = 0;

        for(int i = 0; i < produtos.length; i++){
            System.out.println("\nProduto: " + produtos[i].nome);
            System.out.println("Preço: R$" + produtos[i].preco);
            soma =+ produtos[i].preco;
        }

        double media = soma / produtos.length;

        System.out.println("\nMédia dos preços: R$" + media);

    }
}