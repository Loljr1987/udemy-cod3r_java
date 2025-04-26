package iii_classes;

public class i_Produto {

    String nome;
    double preco;
    double desconto;

    i_Produto(String nomeInicial) {

    }

    double precoComDesconto() {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoGerente) {
        return preco * (1 - desconto + descontoGerente);
    }
}
