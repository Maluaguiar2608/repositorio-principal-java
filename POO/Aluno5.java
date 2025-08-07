//Classe Aluno com nome e nota. Mostre quantos alunos tiraram nota maior ou igual a 7.

public class Aluno5 {
    String nome;
    double nota;

    public Aluno5(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
}

class PrincipalAluno5{
    public static void main (String [] args){
        Aluno5[] alunos = new Aluno5[4];

        alunos[0] = new Aluno5("Malu", 10);
        alunos[1] = new Aluno5("João", 7);
        alunos[2] = new Aluno5("Rafa", 5);
        alunos[3] = new Aluno5("Milton", 3);

        int qtdAluno = 0;

        for(int i = 0; i < alunos.length; i++){
            if(alunos[i].nota >= 7){
                qtdAluno += 1;
            }
        }

        System.out.println("Quantidade de alunos com nota igual ou maior que 7:" + qtdAluno);

    }
}