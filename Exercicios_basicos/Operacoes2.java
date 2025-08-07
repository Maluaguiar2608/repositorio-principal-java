//Peça ao usuário a idade e informe:
//Se a pessoa é criança (até 12)
//Adolescente (13 a 17)
//Adulto (18 ou mais)
//Use if, else if e else.

import java.util.Scanner;

public class Operacoes2 {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        if(idade <= 12){
            System.out.println("Você é uma criança!");
        }else if(idade <= 17){
            System.out.println("Você é um adolescente!");
        }else{
            System.out.println("Você é um adulto!");
        }
    }
}
