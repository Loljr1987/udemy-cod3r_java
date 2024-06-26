package iii_estruturasDeControle;

import java.util.Scanner;

public class IX_DoWhile {

    public static void main(String[] args) {

        // if (expressão) sentença de código; ou {}
        // while ( expressão que retorna true or false) sentença de código {}
        // for (inicialização da variável; a expressão; e a modificação da variável) sentença; ou {}

        // do  sentença de código; ou {} while (expressão);
        // Enquando o 'while' pode ou não ser executada uma ou infinitas
        // vezes o 'do' precisa ser executado pelo menos uma vez

        Scanner entrada = new Scanner(System.in);

        String texto = "";

        do {
            System.out.println("Você precisa dizer "
                    + "\nas palavrinhas mágicas...");
            System.out.print("Quer sair? ");
            texto = entrada.nextLine();
        } while (!texto.equalsIgnoreCase("positango"));

        System.out.println("Valeu!");
        entrada.close();

    }
}
