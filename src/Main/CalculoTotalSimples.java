package Main;

import java.util.List;

public class CalculoTotalSimples implements CalculoTotal {
    @Override
    public double calcularTotal(List<Produto> produtos) {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
}
