// Classe Cliente com nome e CPF. Permita buscar por nome e mostrar o CPF correspondente.

public class Cliente2 {
    String nome;
    long cpf;

    public Cliente2(String nome, long cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
}

class PrincipalCliente2{
    public static void main (String [] args){
        Cliente2[] clientes = new Cliente2[3];

        clientes[0] = new Cliente2("Malu", 43301600808L);
        clientes[1] = new Cliente2("Leo", 94456188253L);
        clientes[2] = new Cliente2("Rafa", 67139810069L);

        for(int i = 0; i < clientes.length; i++){
            if(clientes[i].nome.equals("Malu")){
                System.out.println("Nome: " + clientes[i].nome);
                System.out.println("CPF: " + clientes[i].cpf);
            }
        }
    }
}