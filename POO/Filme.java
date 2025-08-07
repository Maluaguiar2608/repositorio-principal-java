//Crie dois construtores na classe Filme: um com todos os parâmetros (titulo,
// genero) e outro apenas com titulo, que chama o primeiro construtor com
// genero = "Drama".

public class Filme {
    String titulo;
    String genero;

    public Filme(String titulo, String genero){
        this.titulo = titulo;
        this.genero = genero;
    }

    public Filme(String titulo){
        this(titulo,"Drama");
    }

    void exibirDados(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Gênero: " + genero);
    }
}

class PrincipalFilme{
    public static void main (String [] args){
        Filme f1 = new Filme("Teste");
        f1.exibirDados();
    }
}