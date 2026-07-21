public class Main {
    public static void main(String[] args) {
        // --- GRUPO 1: Aliança da Luz ---
        var grupoLuz = new Grupo();
        grupoLuz.adicionarPersonagem(new Guerreiro("Arthur", "Guerreiro", 120, 1200, 600));
        grupoLuz.adicionarPersonagem(new Mago("Merlin", "Mago", 150, 900, 850));
        grupoLuz.adicionarPersonagem(new Guerreiro("Lancelot", "Guerreiro", 110, 1100, 550));

        // --- GRUPO 2: Horda das Sombras ---
        var grupoSombras = new Grupo();
        grupoSombras.adicionarPersonagem(new Guerreiro("Malakor", "Guerreiro", 130, 1300, 700));
        grupoSombras.adicionarPersonagem(new Mago("Morgana", "Mago", 140, 950, 900));
        grupoSombras.adicionarPersonagem(new Guerreiro("Vorgath", "Guerreiro", 125, 1400, 650));

        // --- CRIAÇÃO E EXECUÇÃO DA ARENA ---
        Arena arena = new Arena();
        arena.batalharGrupos(grupoLuz, grupoSombras);
    }
}