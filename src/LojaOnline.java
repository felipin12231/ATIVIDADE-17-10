public class LojaOnline {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Boina", 35.00);
        Produto produto2 = new Produto("Camiseta", 50.00);
        Produto produto3 = new Produto("Calça", 80.00);
        Produto produto4 = new Produto("Óculos", 20.00);

        // Carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);
        carrinho.adicionarProduto(produto4);

        //  Cliente novo
        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total para cliente novo: R$ " + carrinho.calcularTotal());

        // Cliente regular
        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total para cliente regular: R$" + carrinho.calcularTotal());

        // Cliente VIP
        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total para cliente VIP: R$ " + carrinho.calcularTotal());
    }
}
