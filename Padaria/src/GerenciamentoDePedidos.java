import java.util.ArrayList;

public class GerenciamentoDePedidos {
    private ArrayList<Checkout> pedidosPendentes;

    public GerenciamentoDePedidos() {
        this.pedidosPendentes = new ArrayList<Checkout>();
    }

    public void adicionarPedido(Checkout pedido) {
        this.pedidosPendentes.add(pedido);
    }

    public void removerPedido(Checkout pedido) {
        this.pedidosPendentes.remove(pedido);
    }

    public ArrayList<Checkout> listarPedidosPendentes() {
        return this.pedidosPendentes;
    }

    public void marcarPedidoPreparado(Checkout pedido) {
        // Marca o pedido como preparado
    }

    public void marcarPedidoEnviado(Checkout pedido) {
        // Marca o pedido como enviado
    }
}
