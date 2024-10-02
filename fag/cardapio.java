package fag;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Pratos> cardapio;

    public Cardapio() {
        this.cardapio = new ArrayList<>();
        adicionarPratosPreDefinidos();
    }

    private void adicionarPratosPreDefinidos() {
        cardapio.add(new Pratos("Feijoada", 1, 20, true));
        cardapio.add(new Pratos("Macarronada ao Molho Vermelho", 2, 25, true));
        cardapio.add(new Pratos("Strogonoff", 3, 15, true));
        cardapio.add(new Pratos("Frango Xadrez", 4, 25, true));
        cardapio.add(new Pratos("Lasanha", 5, 35, false));
        cardapio.add(new Pratos("Risoto", 6, 30, false));
    }

    public void exibirCardapio() {
        System.out.println("\n--- Cardápio Atual ---");
        for (Pratos prato : cardapio) {
            System.out.println(prato);
        }
    }

    public List<Pratos> getCardapio() {
        return cardapio;
    }
}
