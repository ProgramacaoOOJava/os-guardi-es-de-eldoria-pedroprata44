public class Main {
    public static void main(String[] args) {
        // Instâncias do molde Personagem
        Personagem heroi1 = new Personagem("Arthus", "Guerreiro", 1, 100, 10.5);
        Personagem heroi2 = new Personagem("Kratos", "Guerreiro", 10, 200, 100.9);

        // Exibe as propriedades de cada instância
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
}
