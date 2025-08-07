//Crie uma classe Produto com os atributos nome, preco, quantidade.
// Crie um método que calcule o valor total em estoque. Teste com valores no main.

public class Produto {
    String nome;
    double preco;
    int qtd;

    double calcValor(){
        return (preco*qtd);
    }

    void totalEstoque(){
        double valorEstoque = calcValor();

        System.out.println("Nome do produto: " + nome);
        System.out.println("Estoque: " + qtd);
        System.out.println("Valor total da venda: " + valorEstoque);
    }
}

class PrincipalProduto{
    public static void main (String [] args){
        Produto p1 = new Produto();

        p1.nome = "Caneta";
        p1.preco = 1.50;
        p1.qtd = 2;

        p1.totalEstoque();
    }
}
