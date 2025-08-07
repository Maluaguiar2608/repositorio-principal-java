//Crie uma classe Animal com os atributos nome e especie, e
// métodos emitirSom() e apresentar(). Crie dois objetos e teste.

public class Animal {
    String nome;
    String especie;

    void emitirSom(){
        System.out.println("\nSom emitido pelo animal: ");
        System.out.println("AUAU!!");
    }

    void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
    }
}

class PrincipalAnimal{
    public static void main (String [] args){

        Animal animal1 = new Animal();

        animal1.nome = "Cachorro";
        animal1.especie = "Lulu";

        animal1.apresentar();
        animal1.emitirSom();
    }
}