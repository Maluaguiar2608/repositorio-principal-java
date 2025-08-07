//Classe Filme com título e gênero. Mostre apenas os filmes do gênero "Ação".

public class Filme2 {
    String titulo;
    String genero;

    public Filme2(String titulo, String genero){
        this.titulo = titulo;
        this.genero = genero;
    }
}

class PrincipalFilme2{
    public static void main (String [] args){
        Filme2[] filmes = new Filme2[3];

        filmes[0] = new Filme2("O mundo de Jack", "Ação");
        filmes[1] = new Filme2("Assombração", "Terror");
        filmes[2] = new Filme2("Edward, mãos de tesoura", "Ação");

        for(int i = 0; i < filmes.length; i++){
            if(filmes[i].genero.equals("Ação")){
                System.out.println("\nTítulo: " + filmes[i].titulo);
                System.out.println("Gênero: " + filmes[i].genero);
            }
        }
    }
}