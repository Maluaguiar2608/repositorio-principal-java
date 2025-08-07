//Crie uma classe Aluno com nome e idade.
// Armazene 5 alunos e imprima os nomes dos que têm idade maior que 18.

public class Aluno4 {
    String nome;
    int idade;

    public Aluno4(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

class PrincipalAluno4{
    public static void main (String [] args){
        Aluno4 [] alunos = new Aluno4[5];

        alunos[0] = new Aluno4("Malu",19);
        alunos[1] = new Aluno4("João", 15);
        alunos[2] = new Aluno4("Carlos", 20);
        alunos[3] = new Aluno4("Bárbara", 17);
        alunos[4] = new Aluno4("Samantha", 30);

        System.out.println("Alunos maiores de 18:");
            for(int i = 0; i < alunos.length; i++){
                if(alunos[i].idade > 18){
                    System.out.println("Nome: " + alunos[i].nome);
            }
        }
    }
}
