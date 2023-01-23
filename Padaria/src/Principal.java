public class Principal {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Produto paoFrances = new Produto("Pão Francês", 2.50, "Pão francês fresco e quente, feito diariamente com farinha de qualidade", "pao_frances.jpg");
        Produto croissant = new Produto("Croissant", 3.50, "Croissant crocante e recheado com manteiga e amêndoas", "croissant.jpg");
        Produto boloChocolate = new Produto("Bolo de Chocolate", 15.00, "Bolo de chocolate feito com ingredientes de qualidade e coberto com chocolate derretido", "bolo_chocolate.jpg");

        catalogo.adicionarProduto(paoFrances);
        catalogo.adicionarProduto(croissant);
        catalogo.adicionarProduto(boloChocolate);

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(paoFrances);
        carrinho.adicionarItem(croissant);

        Checkout checkout = new Checkout("João Silva", "Rua das Flores, 123", "Cartão de Crédito", carrinho);
        checkout.finalizarPedido();

        GerenciamentoDePedidos gerenciamento = new GerenciamentoDePedidos();
        gerenciamento.marcarPedidoPreparado(checkout);
        gerenciamento.marcarPedidoEnviado(checkout);

        HistoricoDePedidos historico = new HistoricoDePedidos();
        historico.adicionarPedido(checkout);
        historico.listarPedidos();

        System.out.println(checkout);
    }
}

