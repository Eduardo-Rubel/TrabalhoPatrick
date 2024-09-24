package fag;

import java.util.ArrayList;
import java.util.List;

public class cardapio {
    private List<pratos> cardapio;

    public cardapio() {this.cardapio = new ArrayList<pratos>();}

    public void adicionarprato (pratos prato) {
        this.cardapio.add(prato);
        System.out.println("adicionado com sucesso");
    }

    public void removerprato (int codigodoprato) {
        boolean removido = false;
        List<pratos> pratospararemover = new ArrayList<>();
        for (pratos p : this.cardapio) {
            if (p.getCodigodoprato()==codigodoprato) {
                pratospararemover.add(p);
                removido = true;
            }
        }
        cardapio.removeAll(pratospararemover);
    }
}
