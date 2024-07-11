package i_fundamentos;

public class IV_Inferencia {

    public static void main(String[] args) {

        double a = 4.5; // variável declarada e inicializada
        System.out.println(a);

        a = 12;
        System.out.println(a);

        // a = "..."; Como já foi atribuido um valor 'númerico', não se pode mudar para texto.

        var b = 5.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro Texto";
        System.out.println(c);

        // c = 4.5 Como já foi definido o tipo 'texto', não pode ser atribuido um valor númerico.

        double d; // variável foi declarada
        d = 123.65; // aqui ela foi inicializada
        System.out.println(d); // e aqui ela foi usada!

        var e = 123.45; // Com a variável, na hora que se declara ja tem de ser inicializada na mesma linha
        System.out.println(e);

        var f = 12; // valor inteiro
        // f = 12.01;
        System.out.println(f);
        // valores inteiros podem ser definidos depois com casas decimais, porém o contrário irá apresentar erro
    }
}