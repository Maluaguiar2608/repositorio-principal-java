////Crie uma classe Aluno com os atributos nome, nota1, nota2.
//// Crie um método que calcula a média e outro que mostra se ele está aprovado (média >= 6).
////  Teste no main.

public class ReAluno {
    String nome;
    double nota1;
    double nota2;

    double calcularMedia(){
        return (nota1 + nota2)/2;
    }

    void verificar(){
        double media = calcularMedia();

        System.out.println("Média: " + media);

        if (media >= 6){
            System.out.println("Aprovado!");
        }else{
            System.out.println("Reprovado!");
        }
    }
}

class PrincipalReAluno{
    public static void main (String [] args){
        ReAluno media1 = new ReAluno();

        media1.nome = "Malu";
        media1.nota1 = 9;
        media1.nota2 = 7;

        media1.verificar();
    }
}