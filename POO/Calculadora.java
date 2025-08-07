//Crie uma classe Calculadora com:
//Métodos:
//somar(int a, int b)
//subtrair(int a, int b)
//multiplicar(int a, int b)
//dividir(int a, int b)
//No main, instancie a calculadora e chame os métodos com valores de exemplo.

public class Calculadora {

    int somar(int a, int b){
       return(a +b);
    }

    int subtrair(int a, int b){
        return (a - b);
    }

    int multiplicar(int a, int b){
        return (a * b);
    }

    int dividir(int a, int b){
        return (a / b);
    }
}


class PrincipalCalc{
    public static void main (String [] args){
        Calculadora calc = new Calculadora();

        System.out.println("Soma: " + calc.somar(5,2));
        System.out.println("Subtração: " + calc.subtrair(5,2));
        System.out.println("Multiplicação: " + calc.multiplicar(5,2));
        System.out.println("Divisão: " + calc.dividir(5,2));

    }
}

