import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> itens;

    public Carrinho() {
        this.itens = new ArrayList<Produto>();
    }

    public void adicionarItem(Produto produto) {
        this.itens.add(produto);
    }

    public void removerItem(Produto produto) {
        this.itens.remove(produto);
    }

    public ArrayList<Produto> listarItens() {
        return this.itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }
}

