public class produtoFisico extends abstractProduto {
    private double frete;

    public produtoFisico(String nome, double precoBase, double frete) {
        super(nome, precoBase);
        this.frete = frete;
    }

    @Override
    public double getPrecoFinal() {
        return getPrecoBase() + frete;
    }

    @Override
    public void entrega() {
        System.out.println("Produto enviado para o endereço do cliente.");
    }
}
