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

    public void adicionarPrato() {
        System.out.println("\n--- Adicionar Novo Prato ---");
        System.out.print("Nome do prato: ");
        String nome = scan.nextLine();
        System.out.print("Código do prato: ");
        int codigo = scan.nextInt();
        System.out.print("Preço do prato: ");
        float preco = scan.nextFloat();
        System.out.print("Está disponível? (true/false): ");
        boolean disponibilidade = scan.nextBoolean();
        scan.nextLine();

        cardapio.add(new Pratos(nome, codigo, preco, disponibilidade));
        System.out.println("Prato adicionado com sucesso!");
    }

    public void removerPrato() {
        System.out.println("\n--- Remover Prato ---");
        System.out.print("Digite o código do prato a ser removido: ");
        int codigo = scan.nextInt();
        scan.nextLine();

        Pratos pratoParaRemover = null;
        for (Pratos prato : cardapio) {
            if (prato.getCodigodoprato() == codigo) {
                pratoParaRemover = prato;
                break;
            }
        }

        if (pratoParaRemover != null) {
            cardapio.remove(pratoParaRemover);
            System.out.println("Prato removido com sucesso!");
        } else {
            System.out.println("Prato não encontrado.");
        }
    }

    public void alterarDisponibilidadePrato() {
        System.out.println("\n--- Alterar Disponibilidade de Prato ---");
        System.out.print("Digite o código do prato: ");
        int codigo = scan.nextInt();
        scan.nextLine();

        for (Pratos prato : cardapio) {
            if (prato.getCodigodoprato() == codigo) {
                System.out.print("Nova disponibilidade (true/false): ");
                boolean novaDisponibilidade = scan.nextBoolean();
                prato.setDisponibilidade(novaDisponibilidade);
                System.out.println("Disponibilidade alterada com sucesso!");
                return;
            }
        }

        System.out.println("Prato não encontrado.");
    }

    public void consultarPratoPorNome() {
        System.out.println("\n--- Consultar Prato por Nome ---");
        System.out.print("Digite o nome do prato: ");
        String nome = scan.nextLine();

        for (Pratos prato : cardapio) {
            if (prato.getNomedoprato().equalsIgnoreCase(nome)) {
                System.out.println(prato);
                return;
            }
        }

        System.out.println("Prato não encontrado.");
    }

    public static void main(String[] args) {
        Cardapio gerenciador = new Cardapio();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Gerenciamento do Cardápio ---");
            System.out.println("1. Exibir cardápio");
            System.out.println("2. Adicionar prato");
            System.out.println("3. Remover prato");
            System.out.println("4. Alterar disponibilidade de prato");
            System.out.println("5. Consultar prato por nome");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    gerenciador.exibirCardapio();
                    break;
                case 2:
                    gerenciador.adicionarPrato();
                    break;
                case 3:
                    gerenciador.removerPrato();
                    break;
                case 4:
                    gerenciador.alterarDisponibilidadePrato();
                    break;
                case 5:
                    gerenciador.consultarPratoPorNome();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
