package iii_classes;

public class ii_DataTeste {

    public static void main(String[] args) {

        ii_Data d1 = new ii_Data();
        d1.ano = 1987;

        var d2 = new ii_Data(16, 1,1981);

        String dataFormatada1 = d1.obterDataFormatada();

        System.out.printf(dataFormatada1);
        System.out.printf(d2.obterDataFormatada());

        d1.imprimirDataFormatada();
        d2.imprimirDataFormatada();
    }
}
