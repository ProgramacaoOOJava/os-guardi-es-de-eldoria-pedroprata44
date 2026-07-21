import java.util.Collections;
import java.util.List;

public class Arena {

    public void batalharGrupos(Grupo g1, Grupo g2) {
        List<Personagem> personagensG1 = g1.obterPersonagens();
        List<Personagem> personagensG2 = g2.obterPersonagens();

        // Ordena os personagens de cada grupo pelo nível antes das batalhas
        Collections.sort(personagensG1);
        Collections.sort(personagensG2);

        // Define o limite de duelos com base no menor grupo
        int totalDuelos = Math.min(personagensG1.size(), personagensG2.size());

        System.out.println("\n\n\n=== INÍCIO DAS BATALHAS NA ARENA ===");

        for (int i = 0; i < totalDuelos; i++) {
            Personagem p1 = personagensG1.get(i);
            Personagem p2 = personagensG2.get(i);

            System.out.println("\nIniciando duelo entre " + p1.nome + " (Nível " + p1.nivel + ") e " + p2.nome + " (Nível " + p2.nivel + ")...");

            // Compara diretamente pelo poder total para definir o vencedor
            Personagem vencedor;
            if (p1.poderTotal >= p2.poderTotal) {
                vencedor = p1;
            } else {
                vencedor = p2;
            }

            System.out.println("O vencedor do duelo foi -> " + vencedor.nome);
            System.out.printf("Poder Total: %.2f\n", vencedor.poderTotal);
        }

        System.out.println("\n=== FIM DAS BATALHAS NA ARENA ===\n\n\n");
    }
}