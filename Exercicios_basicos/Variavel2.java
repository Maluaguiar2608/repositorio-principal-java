//Crie duas variáveis int com números diferentes e troque os valores entre elas
// (sem usar uma terceira variável).
//Imprima os valores antes e depois da troca.

package estudo_classe.src.Exercícios_iniciais;

public class Variavel2 {
    public static void main (String [] args){

        int n1 = 2;
        int n2 = 4;

        System.out.println("Valores antes da troca: ");
        System.out.println("Valor 1: " + n1);
        System.out.println("Valor 2: " + n2);

        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;

        System.out.println("\nValores após a troca: ");
        System.out.println("Valor 1: " + n1);
        System.out.println("Valor 2: " + n2);
    }
}
