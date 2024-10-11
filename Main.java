public class Main {
    public static void main(String[] args) {
// o que estiver comentado foi usado para teste
//        Produto celular = new Eletronico("Smartphone", 1500.00) {
//        };
//        Produto camiseta = new Alimento("chocolate", 10.00) {
//        };

//        System.out.println(celular.getNome() + " com desconto: R$" + celular.calcularDesconto(10));
//        System.out.println(chocolate.getNome() + " com desconto: R$" + chocolate.calcularDesconto(10));

//        Produto celular = new Eletronico("Smartphone", 1500.00) {
//        };
//        Produto chocolate = new Alimento("chocolate", 10.00) {
//        };
//        Produto tv = new Eletronico("TV 4K", 3000.00) {
//        };
//        Produto lanche = new Alimento("lanche", 30.00) {
//        };

//        List<Produto> listaDeProdutos = new ArrayList<>();
//        listaDeProdutos.add(celular);
//        listaDeProdutos.add(chocolate);
//        listaDeProdutos.add(tv);
//       listaDeProdutos.add(lanche);

//        Estoque estoque = new Estoque();
//        estoque.exibirPrecosComDesconto(listaDeProdutos, 15);


        Produto celular = new Eletronico("Smartphone", 1500.00) {
        };
        Produto chocolate = new Alimento("Chocolate", 10.00) {
        };
        Produto tv = new Eletronico("TV 4K", 3000.00) {
        };
        Produto lanche = new Alimento("Lanche", 30.00) {
        };

        Estoque estoque = new Estoque();

        estoque.adicionarProduto(celular);
        estoque.adicionarProduto(chocolate);
        estoque.adicionarProduto(tv);
        estoque.adicionarProduto(lanche);

        System.out.println("Lista de produtos no estoque:");
        estoque.listarProdutos();

        System.out.println("\nPreços dos produtos com 15% de desconto:");
        estoque.exibirPrecosComDesconto(15);
    }
}