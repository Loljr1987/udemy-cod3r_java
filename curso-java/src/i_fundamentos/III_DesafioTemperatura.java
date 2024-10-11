package i_fundamentos;

public class III_DesafioTemperatura {

	public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C
        final double fator = 5.0 / 9.0;
        final int ajuste = 32;

        double fahreinheit = 86;
        double celsius = (fahreinheit - ajuste) * fator;
        System.out.println("O resultado é: " + celsius + "°C.");

        fahreinheit = 150;
        celsius = (fahreinheit - ajuste) * fator;
        System.out.println("O resultado é: " + celsius + "°C.");
	}
}