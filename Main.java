import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Lista de filhos do super molde Personagem
        ArrayList<Personagem> personagens = new ArrayList<>();

        // Aqui não podemos mais adicionar Personagem pois é um molde abstrato
        // Podemos apenas adicionar moldes filhos como Guerreiro, Mago ou qualquer molde que extenda esse super
        personagens.add(new Guerreiro("Kratos","Guerreiro", 1, 10, 2));
        personagens.add(new Mago("Odin", "Mago", 10, 100, 500.00));

        // Percorremos a lista com foreach
        for (Personagem personagem : personagens) {
            // Para cada da lista exibe status default do super molde
            personagem.exibirStatus();
            // E exibe método override de habilidade
            personagem.usarHabilidadeEspecial();
        }
    }
}
