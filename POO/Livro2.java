//Crie uma classe Livro com título e autor.
// Cadastre 4 livros e imprima todos com a numeração:
//Livro 1: ..., Livro 2: ...

public class Livro2 {
    String titulo;
    String autor;

    public Livro2(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
}

class PrincipalLivro2{
    public static void main (String [] args){
        Livro2 [] livros = new Livro2[4];

        livros[0] = new Livro2("Pai rico, pai pobre", "Robert Kiyosaki");
        livros[1] = new Livro2("A mente do empreendedor","Kevin Johnson");
        livros[2] = new Livro2("As 48 leis do poder", "Robert Greene");
        livros[3] = new Livro2("Quem pensa enriquece", "Napoleon Hill");

        for(int i = 0; i < livros.length; i++){
            System.out.println("\nLivro " + (i + 1) + ":");
            System.out.println("Nome: " + livros[i].titulo);
            System.out.println("Autor: " + livros[i].autor);
        }
    }
}
