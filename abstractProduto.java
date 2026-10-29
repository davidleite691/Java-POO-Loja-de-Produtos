public abstract class abstractProduto implements intefaceGerenciarEntrega {
    private String nome;
    private double precoBase;

    public abstractProduto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }
    public String getNome() {
        return nome;
    }
    public double getPrecoBase() {
        return precoBase;
    }
    public abstract double getPrecoFinal();
    public abstract void entrega();
}
