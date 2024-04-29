package Main;

public interface CarrinhoDeCompras {
	void adicionarProduto(Produto produto);
    void removerProduto(Produto produto);
    double calcularTotal();
}
