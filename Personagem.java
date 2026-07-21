public abstract class Personagem implements Comparable<Personagem> {
    // Propriedades
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;
    double poderTotal;

    // Super construtor
    public Personagem(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
        this.poderTotal = pontosDeVida * poderBase;
    }

    @Override
    public int compareTo(Personagem outro) {
        // Ordena os personagens pelo nível (crescente)
        return Integer.compare(this.nivel, outro.nivel);
    }

    // Método para exibir o status do personagem
    public void exibirStatus() {
        System.out.println();
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de vida: " + pontosDeVida);
        System.out.println("Poder base: " + poderBase);
        System.out.printf("Poder total: %.2f\n", poderTotal);
        System.out.println();
    }

    public void usarHabilidadeEspecial() {}
}