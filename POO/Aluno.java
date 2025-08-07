//Crie uma classe Aluno com os atributos nome, nota1, nota2.
// Crie um método que calcula a média e outro que mostra se ele está aprovado (média >= 6).
//  Teste no main.

public class Aluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    void verificarAprovacao() {
        double media = calcularMedia();

        System.out.println("Média: " + media);

        if (media >= 6){
            System.out.println("Aprovado!");
        } else{
            System.out.println("Reprovado!");
        }
    }
}

class PrincipalAluno{
    public static void main (String [] args){
        Aluno media1 = new Aluno();

        media1.nome = "Malu";
        media1.nota1 = 7;
        media1.nota2 = 9;

        media1.verificarAprovacao();
    }
}
