package model;
public class Produto {
    public String nome;
    public double preco;
    public int quantidadeEstoque;
    public int quantidadeVendida;

    // Construtor para inicializar o produto
    public Produto(String nome, double preco, int quantidadeInicial) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeInicial;
        this.quantidadeVendida = 0;
    }


    public void realizarVenda(int quantidadeVendida) {
        if (quantidadeVendida > quantidadeEstoque) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            this.quantidadeEstoque -= quantidadeVendida;
            System.out.println("Venda realizada com sucesso!");
        }
    }

    // Método para exibir os dados formatados
    public void exibirInformacoes() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque Atualizado: %d unidades%n",
                nome, preco, quantidadeEstoque);
    }
}