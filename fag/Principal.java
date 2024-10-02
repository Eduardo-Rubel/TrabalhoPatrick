package fag;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaVendas sistema = new SistemaVendas();
        Cardapio cardapio = new Cardapio();
        GerenciamentoMesas gerenciamentoMesas = new GerenciamentoMesas();
        gerenciamentoMesas.adicionarMesas();
        gerenciamentoMesas.ExibirMesas();

        // Adicionar Funcionários
        sistema.adicionarFuncionario(new Funcionario("Carlos", "001", "Garçom", 0));
        sistema.adicionarFuncionario(new Funcionario("Ana", "002", "Garçom", 0));

        // Registrar Pedidos
        System.out.print("Selecione a mesa: ");
        int mesaEscolhida = scanner.nextInt();
        Mesa mesa = gerenciamentoMesas.getMesas().get(mesaEscolhida - 1);
        System.out.print("Selecione o garçom (1-Carlos, 2-Ana): ");
        Funcionario garcom = sistema.getFuncionarios().get(scanner.nextInt() - 1);
        Pedido pedido = new Pedido(mesa, garcom);

        // Adicionar itens ao pedido
        cardapio.exibirCardapio();
        System.out.print("Selecione o prato (código): ");
        int codigoPrato = scanner.nextInt();
        Pratos prato = cardapio.getCardapio().get(codigoPrato - 1);
        pedido.adicionarItem(prato);
        sistema.registrarVenda(pedido);
        sistema.exibirRelatorioVendas();
    }
}

cardapio
package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cardapio {
    private List<Pratos> cardapio;
    Scanner scan = new Scanner(System.in);

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
