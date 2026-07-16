// Mago assim como Guerreiro, é um Personagem
public class Mago extends Personagem {

    public Mago(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        super(nome, classe, nivel, pontosDeVida, poderBase);
    }
    
    @Override
    public void usarHabilidadeEspecial(){
        System.out.println("Mago ataca com fogo azul!");
    }
}
