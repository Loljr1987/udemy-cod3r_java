package iii_classes;

public class iii_AreaCirc {

    double raio;
    final static double PI = 3.1415;

    iii_AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double area() {
        return PI * Math.pow(raio, 2);
    //  return PI * raio * raio;
    }
}
