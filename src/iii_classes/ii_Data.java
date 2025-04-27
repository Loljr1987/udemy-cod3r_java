package iii_classes;

public class ii_Data {

    int dia;
    int mes;
    int ano;

    ii_Data() {
        dia = 1;
        mes = 1;
        ano = 1070; // marco zero para Unix
    }

    ii_Data( int diaInicial, int mesInicial, int anoInicial) {
        dia = diaInicial;
        mes = mesInicial;
        ano = anoInicial;
    }


    String obterDataFormatada() {
        return String.format("%d/%d/%d\n", dia, mes, ano);
    }

    void imprimirDataFormatada() {
        System.out.println(obterDataFormatada());
    }
}
