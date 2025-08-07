//Classe Funcionario com nome e cargo.
// Cadastre 4 funcionários e imprima os que possuem o mesmo cargo.

public class Cargo {
    String nome;
    String cargo;

    public Cargo(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }
}

class PrincipalCargo{
    public static void main (String [] args){
        Cargo [] cargos = new Cargo[4];

        cargos[0] = new Cargo("Malu", "Desenvolvimento");
        cargos[1] = new Cargo("Tiago", "Administração");
        cargos[2] = new Cargo("Felipe", "Desenvolvimento");
        cargos[3] = new Cargo("Helena", "Limpeza");

        System.out.println("Funcionários de mesmo cargo: ");
        for(int i = 0; i < cargos.length; i++){
            if(cargos[i].cargo.equals("Desenvolvimento")){
                System.out.println("Nome: " + cargos[i].nome);
            }
        }
    }
}