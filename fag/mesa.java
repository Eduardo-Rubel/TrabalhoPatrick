package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mesa {
    public static Scanner scan = new Scanner(System.in);
    private int numerodamesa;
    private int capacidade;
    private boolean status;

    public mesa(int numerodamesa, int capacidade, boolean status) {
        this.numerodamesa = numerodamesa;
        this.capacidade = capacidade;
        this.status = status;
    }

    public int getNumerodamesa() {
        return numerodamesa;
    }

    public void setNumerodamesa(int numerodamesa) {
        this.numerodamesa = numerodamesa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Mesa {" +
                "Número da mesa = " + numerodamesa +
                ", Capacidade = " + capacidade +
                ", Status = " + (status ? "Disponível" : "Indisponível") +
                '}';
    }

    public static class GerenciamentoMesas {
        private List<mesa> mesas;


        public GerenciamentoMesas() {
            this.mesas = new ArrayList<>();
        }

        public void adicionarMesa(mesa mesa) {
            mesas.add(mesa);
        }


        public void adicionarMesa(int numero, int capacidade, boolean status) {
            mesa novaMesa = new mesa(numero, capacidade, status);
            mesas.add(novaMesa);
            mesas.add(new mesa(1,2,true));
            mesas.add(new mesa(2,4,false));
            mesas.add(new mesa(3,4,true));
            mesas.add(new mesa(4,4,false));
            mesas.add(new mesa(5,6,true));
            mesas.add(new mesa(6,4,true));
            mesas.add(new mesa(7,6,false));
            mesas.add(new mesa(8,4,true));
            mesas.add(new mesa(9,2,true));
            mesas.add(new mesa(10,2,true));
        }


        public void exibirMesas() {
            for (fag.mesa mesa : mesas) {
                System.out.println(mesa);
            }
        }
    }

}
