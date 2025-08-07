//Use a classe Pessoa com um construtor que receba nome e idade.
// No método main, crie duas pessoas diferentes.

public class Pessoa3 {
    String nome;
    int idade;

    public Pessoa3(String nome, int idade){
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class PrincipalPessoa3{
    public static void main (String [] args){
        Pessoa3 p1 = new Pessoa3("Malu",19);

        Pessoa3 p2 = new Pessoa3("Michael",28);
    }
}
