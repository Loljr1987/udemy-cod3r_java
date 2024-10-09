package ii_operadores;

public class VII_Unarios {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        // forma pós fixada, operador depois incremento
        a++; // a = a + 1 incremento
        a--; // a = a - 1 decremento
        // não é exclusivo apenas de números inteiros, mas para qualquer um

        // forma pré fixada, operando aós o incremento
        ++b; // a = a + 1 incremento
        --b; // a = a + 1 incremento

        System.out.println(a);
        System.out.println(b);

        System.out.println("\nMini Desafio ...");
        System.out.println(++a == b--);
        System.out.println(a == b);
        System.out.println(a);
        System.out.println(b);
    }
}
