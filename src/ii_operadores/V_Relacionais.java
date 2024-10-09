package ii_operadores;

public class V_Relacionais {
    public static void main(String[] args) {

        int a = 97;
        int b = 'a';

        System.out.println(a == b); // comparativo (==)
        System.out.println(3 > 4); // maior quê (>)
        System.out.println(3 >= 3); // maior igual (>=	)
        System.out.println(3 < 7); // menor quê (<)
        System.out.println(30 <= 7); // menor igual (<=)
        System.out.println(30 != 7); // diferente (!=)

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);
    }
}
