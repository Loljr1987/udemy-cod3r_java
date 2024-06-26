package iii_estruturasDeControle;

import java.util.Scanner;

public class V_DesafioDiaSemana {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do dia: ");

        String dia = entrada.next();

        if ("domingo".equalsIgnoreCase(dia)) { // tanto o valor literal no início é  como no final é válido
            System.out.println(1);
        } else if ("segunda".equalsIgnoreCase(dia)) { // o .equalsIgnoreCase() é para não considerar letras maiúsculas ou minúsculas
            System.out.println(2);
        } else if ("terça".equalsIgnoreCase(dia)
                || "terca".equalsIgnoreCase(dia)) {
            System.out.println(3);
        } else if ("quarta".equalsIgnoreCase(dia)) {
            System.out.println(4);
        } else if ("quinta".equalsIgnoreCase(dia)) {
            System.out.println(5);
        } else if ("sexta".equalsIgnoreCase(dia)) {
            System.out.println(6);
        } else if ("sábado".equalsIgnoreCase(dia)
                || "sabado".equalsIgnoreCase(dia)) {
            System.out.println(7);
        } else {
            System.out.println("Dia inválido!");
        }


        entrada.close();
    }
}
