public abstract class Produto {
    private String nome;
    private double preco;
    private String descricao;
    private String foto;

    public Produto(String nome, double preco, String descricao, String foto) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public abstract double calcularPreco();
}
