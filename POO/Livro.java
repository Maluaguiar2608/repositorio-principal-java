// Crie uma classe Livro com os atributos: titulo, autor e numeroDePaginas.
// Crie um método exibirDetalhes. No main, crie dois livros e mostre os dados deles.

public class Livro {
    String titulo;
    String autor;
    int numPaginas;

    void infoLivro(){
        System.out.println("Informações do livro:");
        System.out.println("\nTítulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de páginas: " + numPaginas);
    }
}

class PrincipalLivro    {
    public static void main (String [] args){

        Livro livro1 = new Livro();

        livro1.titulo = "Pai rico, Pai pobre";
        livro1.autor = "Robert";
        livro1.numPaginas = 547;

        livro1.infoLivro();
    }
}