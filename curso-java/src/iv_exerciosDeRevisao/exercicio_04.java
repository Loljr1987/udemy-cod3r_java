package iv_exerciosDeRevisao;

import java.util.Scanner;

public class exercicio_04 {

	/**
	 * Criar um programa que receba um número e 
	 * verifique se ele é um número primo ou não.
	 */
	
	public static void main(String[] args) {

		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número para verificar se é primo ou não:");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\nO número " + numero + " é primo.");
		} else {
			System.out.println("\nO número " + numero + " não é primo.");
		}

		entrada.close();

	}
	
}
