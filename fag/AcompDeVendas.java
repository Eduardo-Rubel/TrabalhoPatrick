package fag;

import java.util.ArrayList;
import java.util.List;

public class AcompDeVendas {

    public static class SistemaVendas {
        private List<Funcionario> funcionarios = new ArrayList<>();

        public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        }
        
        public void registrarVenda(String nomeFuncionario, int quantidadeVendas) {
        for (Funcionario f : funcionarios) {
        if (f.getNome().equalsIgnoreCase(nomeFuncionario)) {
        int vendasAtuais = f.getTotaldevendas();
        f.setTotaldevendas(vendasAtuais + quantidadeVendas);
        return;
        }
        }
        System.out.println("Funcionário não encontrado.");
        }

        public void exibirRelatorioVendas() {
        for (Funcionario f : funcionarios) {
        System.out.println(f);
    }
    }
    }
}
