package i_fundamentos;

public class II_AreaCircunferencia {
	

    public static void main(String[] args) {
        // int raio = 3; numero inteiro
        double raio = 3.4; // um numero com casa decimal
        final double PI = 3.14159; // não pode ser reatribuida devido a atribuição 'final'
        // para uma questão de boa prática, descreve-se contantes com letras maiúsculas
        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI *raio * raio;
        System.out.println("Área = " + area + "m2."); // o sinal de '+' serve para concatenar (juntar)
    }
}