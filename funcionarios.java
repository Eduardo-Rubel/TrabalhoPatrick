package fag;

public class funcionarios {
    private String nome;
    private String idf;
    private String cargo;
    private int totaldevendas;

    public funcionarios(String nome, String idf, String cargo, int totaldevendas) {
        this.nome = nome;
        this.idf = idf;
        this.cargo = cargo;
        this.totaldevendas = totaldevendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdf() {
        return idf;
    }

    public void setIdf(String idf) {
        this.idf = idf;
    }

    public int getTotaldevendas() {
        return totaldevendas;
    }

    public void setTotaldevendas(int totaldevendas) {
        this.totaldevendas = totaldevendas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "ID: " + idf + "Cargo: " + cargo + "Total de vendas: " + totaldevendas;
    }
}
