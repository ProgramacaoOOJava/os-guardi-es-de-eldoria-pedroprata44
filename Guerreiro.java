// Guerreiro é um Personagem
public class Guerreiro extends Personagem {

    public Guerreiro(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        // Super invoca o construtor do super molde
        super(nome, classe, nivel, pontosDeVida, poderBase);
    }
    
    // Override indica que estamos sobreescrevendo o método do super molde
    // Podemos sobreescrever e usarmos como quisermos, respeitando o tipo de retorno
    @Override
    public void usarHabilidadeEspecial(){
        System.out.println("Guerreiro ataca com super espada!");
    }
}
