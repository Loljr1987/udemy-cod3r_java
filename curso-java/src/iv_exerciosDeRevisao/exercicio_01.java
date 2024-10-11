package iv_exerciosDeRevisao;

import java.util.Scanner;

public class exercicio_01 {
	
	/**
	 * Criar um programa que receba um número e verifique
	 *  se ele está entre um determiando range e se é par ou não;
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int numero = entrada.nextInt();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O número " + numero + " está entre 0 e 10 e ele é par.");
			} else {
				System.out.println("O número " + numero + " está entre 0 e 10, porém ele não é par.");
			}
		} else {
			System.out.println("O número " + numero + " não está entre no range.");
		}
		entrada.close();
	}

}
