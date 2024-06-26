package i_fundamentos;

public class II_AreaCircunferencia {
	

    public static void main(String[] args) {
        // int raio = 3; numero inteiro
        double raio = 3.4; // um numero com casa decial
        final double PI = 3.14159; // uma vauma variíavel cujo número não pode varial devido à constante 'final'

        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI *raio * raio;
        System.out.println("Área = " + area + "m2."); // o sinal de '+' serve pára concatenar (juntar).4
    }
}