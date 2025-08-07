// Crie uma classe Livro com titulo e autor.
// Crie um construtor que receba esses valores como parâmetro e imprima os dados do livro.

public class Titulo2 {
    String autor;
    String titulo;

    public Titulo2(String autor_, String titulo_){
        autor = autor_;
        titulo = titulo_;
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
    }
}

class PrincipalTitulo2{
    public static void main (String [] args){
        Titulo2 t1 = new Titulo2("Robert", "Pai pobre, Pai rico");
    }
}
