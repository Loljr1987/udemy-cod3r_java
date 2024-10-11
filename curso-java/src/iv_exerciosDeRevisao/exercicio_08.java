package iv_exerciosDeRevisao;

import java.util.Scanner;

public class exercicio_08 {
	/**
	 * Crie um programa que recebe 10 valores e no final mostre o maior número.
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int maiorValor = 0;
		int contador = 0;

		do {
			System.out.println("Digite um número: ");
			int valor = entrada.nextInt();

			if (valor > maiorValor) {
				maiorValor = valor;
			}

			contador++;
		} while (contador != 10);

		System.out.printf("O maior valor foi: " + maiorValor);
		entrada.close();
	}
}
