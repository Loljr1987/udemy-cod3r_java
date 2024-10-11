package iii_estruturasDeControle;

public class VI_WhileDeterminado {

    public static void main(String[] args) {

        int contador = 1;
        while (contador <= 10) {
            System.out.printf("Dia = %d\n", contador);
            contador++; //aqui o incrementaro será de: um em um.
         // contador += 2; já aqui será de dois em dois.
         // o While é utilizado mais em casos de estruturas indeterminadas, nesse exemplo está de maneira determianda.
        }

        
    }
}
