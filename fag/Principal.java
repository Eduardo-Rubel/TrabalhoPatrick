package fag;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println(" Sistema de Gerenciamento de Restaurante com Controle de Funcionários e Vendas\n ");
			System.out.println("      Escolha uma Opcao:\n");
			System.out.println("\n");
			System.out.println("    1. Exibir cardápio\n");
			System.out.println("    2. Adicionar prato\n");
			System.out.println("    3. Remover prato\n");
			System.out.println("    4. Fechar Conta da Mesa\n");
			System.out.println("    5. Sair\n");
			int opcao = scanner.nextInt();

			switch (opcao) {
				case 1:

					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Opção inválida.");
			}

		}
	}
}
