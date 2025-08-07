//Crie a classe ContaBancaria com um construtor que, ao criar a conta,
// chame o método exibirMensagem() que imprime "Conta criada com sucesso".

public class ContaBancaria2 {

    public ContaBancaria2() {
        exibirMensagem();
    }
    void exibirMensagem () {
        System.out.println("Conta criada com sucesso!");
    }
}

class PrincipalContaBancaria2{
    public static void main (String [] args){
        ContaBancaria2 c1 = new ContaBancaria2();
    }
}

