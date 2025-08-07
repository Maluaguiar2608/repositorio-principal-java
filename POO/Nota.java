//Na classe Nota, crie um construtor que receba valor.
// Se o valor estiver fora do intervalo 0 a 10, defina como 0.

public class Nota {
    double valor;

    public Nota(double valor_){
        if(valor_ < 0 || valor_ > 10){
            valor = 0;
        }else{
            valor = valor_;
        }
        System.out.println("Valor: " + valor);
    }
}
class PrincipalNota{
    public static void main (String [] args){
        Nota n1 = new Nota(5);
        Nota n2 = new Nota(12);
    }
}
