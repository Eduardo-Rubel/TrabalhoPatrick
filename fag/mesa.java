package fag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mesa {
    public static Scanner scan = new Scanner(System.in);
    private int numerodamesa;
    private int capacidade;
    private boolean status;

    public Mesa(int numerodamesa, int capacidade, boolean status) {
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
        private static List<Mesa> mesas;


        public GerenciamentoMesas() {
            this.mesas = new ArrayList<>();
        }

        public void adicionarMesa(Mesa mesa) {
            mesas.add(mesa);
        }


        public void adicionarMesas() {

            mesas.add(new Mesa(1,2,true));
            mesas.add(new Mesa(2,4,false));
            mesas.add(new Mesa(3,4,true));
            mesas.add(new Mesa(4,4,false));
            mesas.add(new Mesa(5,6,true));
            mesas.add(new Mesa(6,4,true));
            mesas.add(new Mesa(7,6,false));
            mesas.add(new Mesa(8,4,true));
            mesas.add(new Mesa(9,2,true));
            mesas.add(new Mesa(10,2,true));
        }

        public static List<Mesa> getMesas() {
            return mesas;
        }

        public static void setMesas(List<Mesa> mesas) {
            GerenciamentoMesas.mesas = mesas;
        }

        public static void ExibirMesas() {
            for (Mesa mesa : mesas) {
                System.out.println(mesa);
            }
        }
    }

}
