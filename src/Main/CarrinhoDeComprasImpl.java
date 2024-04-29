package Main;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeComprasImpl implements CarrinhoDeCompras {
    private List<Produto> produtos;
    private CalculoTotal calculoTotal;

    public CarrinhoDeComprasImpl(CalculoTotal totalCalculator) {
        this.produtos = new ArrayList<>();
        this.calculoTotal = totalCalculator;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    @Override
    public double calcularTotal() {
        return calculoTotal.calcularTotal(produtos);
    }
}
