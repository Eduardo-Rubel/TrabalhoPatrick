package fag;

import java.util.Scanner;

import static fag.Mesa.GerenciamentoMesas.*;

public class Principal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao restaurante jacoba");
		System.out.println("Selecione a mesa que deseja");

		Mesa.GerenciamentoMesas gerenciamentoMesas = new Mesa.GerenciamentoMesas();
		gerenciamentoMesas.adicionarMesas();
		gerenciamentoMesas.ExibirMesas();

		System.out.println("Selecione o a mesa desejada");
		int opcao1 = scanner.nextInt();
		for(Mesa mesas: gerenciamentoMesas.getMesas()) {
			if(mesas.getNumerodamesa() == opcao1) {
				if(!mesas.isStatus()){
					System.out.println("Essa mesa não está disponivel");
					return;}
				mesas.setStatus(false);
			}


		}
		gerenciamentoMesas.ExibirMesas();

		INSERIR CARDAPIO

		}
}
