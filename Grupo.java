import java.util.ArrayList;

// Molde Grupo
public class Grupo {
    // Lista de personagens
    private ArrayList<Personagem> membros;

    // Construtor inicializa a lista vazia
    public Grupo() {
        membros = new ArrayList<Personagem>();
    }

    // Adiciona um objeto do tipo Personagem na lista
    public Personagem adicionarPersonagem(Personagem p) {
        membros.add(p);
        return p;
    }

    // Retorna a lista
    public ArrayList<Personagem> obterPersonagens() {
        return membros;
    }
}