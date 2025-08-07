//Peça ao usuário um número e use um while para contar de 0 até esse número.

import java.util.Scanner;

public class LacosRepeticao2 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int n = sc.nextInt();

        int i = 0;

        while(i <= n){
            System.out.println("Valor: " + i);
            i++;
        }
    }
}
