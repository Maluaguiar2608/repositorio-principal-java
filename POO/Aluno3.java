//Crie a classe Aluno com nome e curso.
// No construtor, use this para diferenciar os parâmetros dos atributos.

public class Aluno3 {
    String nome;
    String curso;

    public Aluno3(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
    }
}
class PrincipalAluno3{
    public static void main (String [] args){
        Aluno3 a1 = new Aluno3("Malu", "Ciência da Computação");
    }
}