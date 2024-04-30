package Main;

public class Main {
	public static void main(String[] args) {
        Produto p1 = new Produto("Camisa", 29.99);
        Produto p2 = new Produto("Calça", 49.99);
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);

        System.out.println("Total: " + carrinho.calcularTotal());
    }
}
