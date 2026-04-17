import model.Produto;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade inicial em estoque: ");
        int qtdInicial = sc.nextInt();


        Produto p1 = new Produto(nome, preco, qtdInicial);

        System.out.println("\n--- Status Inicial ---");
        p1.exibirInformacoes();


        System.out.print("\nQuantidade a vender: ");
        int venda = sc.nextInt();
        p1.realizarVenda(venda);


        System.out.println("\n--- Status Atualizado ---");
        p1.exibirInformacoes();

        sc.close();
    }
}