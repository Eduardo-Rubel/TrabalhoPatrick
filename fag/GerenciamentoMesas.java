package fag;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoMesas {
    private List<Mesa> mesas;

    public GerenciamentoMesas() {
        this.mesas = new ArrayList<>();
    }

    public void adicionarMesas() {
        mesas.add(new Mesa(1, 2, true));
        mesas.add(new Mesa(2, 4, false));
        mesas.add(new Mesa(3, 4, true));
        mesas.add(new Mesa(4, 4, false));
        mesas.add(new Mesa(5, 6, true));
        mesas.add(new Mesa(6, 4, true));
        mesas.add(new Mesa(7, 6, false));
        mesas.add(new Mesa(8, 4, true));
        mesas.add(new Mesa(9, 2, true));
        mesas.add(new Mesa(10, 2, true));
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public void exibirMesas() {
        System.out.println("\n--- Mesas Disponíveis ---");
        for (Mesa mesa : mesas) {
            System.out.println(mesa);
        }
    }

    public Mesa buscarMesaPorNumero(int numero) {
        for (Mesa mesa : mesas) {
            if (mesa.getNumerodamesa() == numero) {
                return mesa;
            }
        }
        return null;
    }

    public void atualizarStatusMesa(int numero, boolean status) {
        Mesa mesa = buscarMesaPorNumero(numero);
        if (mesa != null) {
            mesa.setStatus(status);
            String estado = status ? "disponível" : "indisponível";
            System.out.println("Mesa " + numero + " agora está " + estado + ".");
        } else {
            System.out.println("Mesa não encontrada.");
        }
    }

    public void liberarMesa(int numero) {
        atualizarStatusMesa(numero, true);
    }

    public void ocuparMesa(int numero) {
        atualizarStatusMesa(numero, false);
    }
}
