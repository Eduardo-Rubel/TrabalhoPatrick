package fag;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaVendas sistema = new SistemaVendas();
        Cardapio cardapio = new Cardapio();
        GerenciamentoMesas gerenciamentoMesas = new GerenciamentoMesas();
        gerenciamentoMesas.adicionarMesas();
        gerenciamentoMesas.exibirMesas();

        sistema.adicionarFuncionario(new Funcionario("Carlos", "001", "Garçom", 0));
        sistema.adicionarFuncionario(new Funcionario("Ana", "002", "Garçom", 0));

        System.out.print("Selecione a mesa: ");
        int mesaEscolhida = scanner.nextInt();
        Mesa mesa = gerenciamentoMesas.getMesas().get(mesaEscolhida - 1);

        System.out.print("Selecione o garçom (1-Carlos, 2-Ana): ");
        Funcionario garcom = sistema.getFuncionarios().get(scanner.nextInt() - 1);

        Pedido pedido = new Pedido(mesa, garcom);

        cardapio.exibirCardapio();
        System.out.print("Selecione o prato (código): ");
        int codigoPrato = scanner.nextInt();
        Pratos prato = cardapio.getCardapio().get(codigoPrato - 1);

        pedido.adicionarItem(prato);
        sistema.registrarVenda(pedido);
        sistema.exibirRelatorioVendas();

        scanner.close();
    }
}
