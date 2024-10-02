package fag;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
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
}
