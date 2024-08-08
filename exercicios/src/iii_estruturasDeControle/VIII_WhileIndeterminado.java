package iii_estruturasDeControle;

import java.util.Scanner;

public class VIII_WhileIndeterminado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.print("Você diz: ");
            valor = entrada.nextLine(); // se não colocar a String no início,
            							// se torna um laço inquebravel
        }

        entrada.close();
    }
}
