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

    public int getCodigod
