import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println(produto.getNome() + " foi adicionado.");
    }

    public void removerProduto(Produto produto) {
        if (produtos.remove(produto)) {
            System.out.println(produto.getNome() + " foi removido.");
        } else {
            System.out.println(produto.getNome() + " não encontrado.");
        }
    }

    public void exibirPrecosComDesconto(double porcentagemDesconto) {
        for (Produto produto : produtos) {
            double precoComDesconto = produto.calcularDesconto(porcentagemDesconto);
            System.out.println(produto.getNome() + " - Preço com desconto: R$ " + precoComDesconto);
        }
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            System.out.println("Produtos no estoque:");
            for (Produto produto : produtos) {
                System.out.println("- " + produto.getNome() + " (R$ " + produto.getPreco() + ")");
            }
        }
    }
}

