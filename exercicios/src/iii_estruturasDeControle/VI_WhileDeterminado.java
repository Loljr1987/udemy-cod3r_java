package iii_estruturasDeControle;

public class VI_WhileDeterminado {

    public static void main(String[] args) {

        int contador = 1;
        while (contador <= 20) {
            System.out.printf("i = %d\n", contador);
//            contador++; // aqui o contador incrementará de: um em um.
            contador += 2; // já aqui será de dois em dois.
        }


    }
}
