//Crie uma classe Funcionario com nome e salario.
// Crie um construtor que sempre defina o nome como "João" e o salário como 2000.

public class Funcionario {
    String nome = "João";
    double salario = 2000;

    public Funcionario(){
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }
}

class PrincipalFuncionario{
    public static void main(String [] args){
        Funcionario f1 = new Funcionario();
    }
}
