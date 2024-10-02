package fag; 

import java.util.ArrayList;
import java.util.List;
public class SistemaVendas 
{ private List<Funcionario> funcionarios = new ArrayList<>();
 private List<Pedido> pedidos = new ArrayList<>();
 private float totalVendas = 0; 
public void registrarVenda(Pedido pedido) 
{ pedidos.add(pedido); totalVendas += pedido.getTotal(); 
System.out.println("Pedido registrado: R$ " + pedido.getTotal()); 
} 
public void exibirRelatorioVendas()
 { System.out.println("Total de vendas do dia: R$ " + totalVendas);
 for (Pedido p : pedidos) 
{ System.out.println("Mesa: " + p.getMesa().getNumerodamesa() + ", Garçom: " + p.getGarcom().getNome() + ", Total: R$ " + p.getTotal()); } }
 public void adicionarFuncionario(Funcionario funcionario) 
{ funcionarios.add(funcionario); 
} 
public List<Funcionario> getFuncionarios()
 { return funcionarios; } }
