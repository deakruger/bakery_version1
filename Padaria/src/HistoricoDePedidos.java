import java.util.ArrayList;

public class HistoricoDePedidos {
    private ArrayList<Checkout> pedidosAnteriores;

    public HistoricoDePedidos() {
        this.pedidosAnteriores = new ArrayList<Checkout>();
    }

    public void adicionarPedido(Checkout pedido) {
        this.pedidosAnteriores.add(pedido);
    }

    public ArrayList<Checkout> listarPedidos() {
        return this.pedidosAnteriores;
    }

    public void rastrearPedido(Checkout pedido) {
        // Código para rastrear o status de entrega do pedido
    }
}
