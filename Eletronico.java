public abstract class Eletronico extends Produto{

    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto(double Porcentagem) {
        //aumentei 15% de descontos adicionais para produtos eletronicos
        double desconto = preco * (Porcentagem / 100);
        double descontoAdicional = preco * 0.15;
        return preco - (descontoAdicional + desconto);
    }

}
