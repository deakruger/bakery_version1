public class Checkout {
    private String nome;
    private String endereco;
    private String metodoPagamento;
    private Carrinho carrinho;

    public Checkout(String nome, String endereco, String metodoPagamento, Carrinho carrinho) {
        this.nome = nome;
        this.endereco = endereco;
        this.metodoPagamento = metodoPagamento;
        this.carrinho = carrinho;
    }

    public void finalizarPedido() {
        // Envia o pedido para o gerenciamento de pedidos
    }
}
