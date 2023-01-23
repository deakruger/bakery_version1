import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Produto> produtos;

    public Catalogo() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public ArrayList<Produto> listarProdutos() {
        return this.produtos;
    }
}
