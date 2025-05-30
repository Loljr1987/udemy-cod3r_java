package iii_classes;

public class iii_AreaCircTeste {

    public static void main(String[] args) {

        iii_AreaCirc a1 = new iii_AreaCirc(10);
        // a1.pi = 100000000;

        iii_AreaCirc a2 = new iii_AreaCirc(5);
        // a2.pi = 0;

        // iii_AreaCirc.PI = 3.1415;

        System.out.println(a1.area());

        System.out.println(a2.area());
        System.out.println(iii_AreaCirc.PI);
        System.out.println(Math.PI);
    }
}
