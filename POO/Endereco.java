//Crie uma classe Endereco e uma classe Cliente.
// O Cliente deve receber um Endereco no construtor.

public class Endereco {
    String rua;
    int numero;

    public Endereco(String rua_, int numero_){
        rua = rua_;
        numero = numero_;

    }

    void exibirEndereco(){
        System.out.println("Rua: " + rua);
        System.out.println("Número: " + numero);

    }
}

class Cliente{
    String nome;
    Endereco endereco;

    public Cliente(String nome_, Endereco endereco_){
        nome = nome_;
        endereco = endereco_;
    }

    void exibirDados(){
        System.out.println("Nome: " + nome);
        endereco.exibirEndereco();
    }
}

class PrincipalEndereco{
    public static void main(String [] args){
        Endereco end = new Endereco("Rua das Flores", 123);
        Cliente cli = new Cliente("Maria", end);

        cli.exibirDados();
    }
}
