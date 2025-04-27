package iii_classes;

public class i_ProdutoTeste {

    public static void main(String[] args) {

        i_Produto p1 = new i_Produto("Notebook",
                6300.50,
                0.25);

        var p2 = new i_Produto();
        p2.nome = "Monitor";
        p2.preco = 1400.80;
        p2.desconto = 0.25;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto(0);
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do Carrinho = R$%.2f.", mediaCarrinho);
    }
}
