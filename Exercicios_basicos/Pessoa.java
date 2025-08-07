//Crie uma classe chamada Pessoa com os seguintes atributos:
//nome (String)
//idade (int)
//Depois, crie um objeto da classe Pessoa no main e atribua valores para nome e idade.
// Por fim, imprima os valores.

package Exercícios_iniciais;

public class Pessoa{
    String nome;
    int idade;

    public void recebeInfo(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public static void main (String [] args){
        Pessoa p1 = new Pessoa();

        p1.recebeInfo("Malu", 19);

        System.out.println("Nome: " + p1.nome);
        System.out.println("Idade: " + p1.idade + " anos");
    }
}
