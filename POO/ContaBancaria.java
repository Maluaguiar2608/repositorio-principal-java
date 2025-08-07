//Crie uma classe ContaBancaria com:
//Atributos: nomeTitular, numeroConta, saldo
//Métodos:
//depositar(double valor)
//sacar(double valor)
//exibirSaldo()
//No main, crie uma conta, deposite e saque valores, depois exiba o saldo.

public class ContaBancaria {
    String nomeTitular;
    int numeroConta;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    void exibirSaldo() {
        System.out.println("\nTitular: " + nomeTitular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: R$" + saldo);
    }
}

class PrincipalConta{
    public static void main (String [] args){

        ContaBancaria c1 = new ContaBancaria();

        c1.nomeTitular = "Malu";
        c1.numeroConta = 579648;
        c1.saldo = 1500;

        c1.depositar(500);
        c1.sacar(200);
        c1.exibirSaldo();
    }
}