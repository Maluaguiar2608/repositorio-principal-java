//Crie um programa que peça dois números e imprima:
//Soma
//Subtração
//Multiplicação
//Divisão
//Resto
import java.util.Scanner;

public class Operacoes1 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n1 = sc.nextInt();

        System.out.println("Informe outro número: ");
        int n2 = sc.nextInt();

        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação: " + (n1 * n2));
        System.out.println("Divisão: " + (n1/n2));
        System.out.println("Resto: " + (n1%n2));

    }
}
