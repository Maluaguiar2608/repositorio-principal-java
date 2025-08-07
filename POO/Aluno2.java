//Crie uma classe Aluno com dois construtores: um sem parâmetros e outro com nome e nota.

public class Aluno2 {
    String nome;
    double nota;

    public Aluno2(){};

    public Aluno2(String nome_, double nota_){
        nome = nome_;
        nota = nota_;
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
    }
}

class PrincipalAluno2{
    public static void main (String [] args){
        Aluno2 a1 = new Aluno2("Malu", 10);
    }
}
