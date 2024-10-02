package fag;

public class Pratos {
    private String nomedoprato;
    private int codigodoprato;
    private float preco;
    private boolean disponibilidade;

    public Pratos(String nomedoprato, int codigodoprato, float preco, boolean disponibilidade) {
        this.nomedoprato = nomedoprato;
        this.codigodoprato = codigodoprato;
        this.preco = preco;
        this.disponibilidade = disponibilidade;
    }

    public String getNomedoprato() {
        return nomedoprato;
    }

    public void setNomedoprato(String nomedoprato) {
        this.nomedoprato = nomedoprato;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getCodigodoprato() {
        return codigodoprato;
    }

    public void setCodigodoprato(int codigodoprato) {
        this.codigodoprato = codigodoprato;
    }

    @Override
    public String toString() {
        return "Prato{" +
                "Nome do prato='" + nomedoprato + '\'' +
                ", Código do prato=" + codigodoprato +
                ", Preço=" + preco +
                ", Disponibilidade=" + disponibilidade +
                '}';
    }
}
