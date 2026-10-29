public class produtoDigital extends abstractProduto {
    double desconto;

    public produtoDigital(String nome, double precoBase, double desconto) {
        super(nome, precoBase);
        this.desconto = desconto;
    }

    @Override
    public double getPrecoFinal() {
        return getPrecoBase() - (getPrecoBase() * (desconto / 100));
    }

    @Override
    public void entrega() {
        System.out.println("Link de download enviado por e-mail.");
    }
}
