// super molde Personagem
public abstract class Personagem {
    // Propriedades
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Super construtor
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Método compartilhado
    public void exibirStatus() {
        System.out.println();
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de vida: " + pontosDeVida);
        System.out.println("Poder base: " + poderBase);
        System.out.println();
    }

    // Método que pode sofrer override nos moldes filhos
    public void usarHabilidadeEspecial(){}
}

