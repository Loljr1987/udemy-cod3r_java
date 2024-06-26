package iii_estruturasDeControle;

public class VII_For01 {

    public static void main(String[] args) {

        // Diferente de While, For já determina a quantidadde de
        // repetições sem um laço infinito.
        // Dividido em basicamente 3 partes;
        // 1º Parte: Declaração da variável;
        // 2º Parte: A expressão que deverá retornar verdadeiro ou falso (se deverrá continuar repetindo ou não)
        // 3º Parte: Fiocará a cargo da mudaça da variável de controle que determinará o fim do laço.
        for (int contador = 0; contador <= 20; contador += 2) {
            System.out.printf("i = %d\n", contador);
        }

//        // As três partes não precisam estar definidas dentro do For.
//        int x = 2;
//        for (; x < 10;) {
//            System.out.println("x = " + x);
//            x++;
//        }

//        // Porém podemos ter um laço infinito mesmo no For.
//        for (; true;) { // Desse jeito ficará em laço infinito.
//            System.out.println("Fim!");
//        }
    }
}
