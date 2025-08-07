//Crie uma classe Jogador com nome e pontuação.
// Mostre qual jogador teve a maior pontuação.

public class Jogador {
    String nome;
    int pontuacao;

    public Jogador(String nome, int pontuacao){
        this.nome = nome;
        this.pontuacao = pontuacao;
    }
}

class PrincipalJogador{
    public static void main (String [] args){
        Jogador[] jogadores = new Jogador[2];

        jogadores[0] = new Jogador("Malu",10);
        jogadores[1] = new Jogador("Neymar", 8);

        int maiorPontuacao = jogadores[0].pontuacao;
        String maiorNome = jogadores[0].nome;

        for(int i = 0; i < jogadores.length; i++){
            if(jogadores[i].pontuacao > maiorPontuacao){
                maiorPontuacao = jogadores[i].pontuacao;
                maiorNome = jogadores[i].nome;
            }
        }

        System.out.println("Nome do jogador: " + maiorNome);
        System.out.println("Maior pontuação: " + maiorPontuacao);
    }
}