package iv_exerciosDeRevisao;

import java.util.Random;
import java.util.Scanner;

public class exercicio_06 {
	/**
	 * Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazenar
	 * um número aleatório em uma variável. O Jogador terá 10 tentativas para
	 * adivinhar o número gerado. No final de cada tentativa, terá d3e mostrar a
	 * quantidade de tentativas restantes, e se o número inserido é maior ou menor
	 * do que o número secreto.
	 */

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;

		do {
			System.out.println("Sorteando numero entre 0 e 100...\n");
			Random numeroAleatorio = new Random();
			numeroSorteado = numeroAleatorio.nextInt(101);

			System.out.println("Começou o jogo! Bora ver se tu é bom ou não.");
			tentativas = 0;

			do {
				tentativas++;
				System.out.printf("Tentativa %d: ", tentativas);
				numero = entrada.nextInt();

				if (numero > numeroSorteado) {

					System.out.printf("\nO número secreto e menor que %d\n\n", numero);

				} else if (numero < numeroSorteado) {

					System.out.printf("\nO número secreto é maior que %d\n\n", numero);

				} else {

					System.out.printf("\nParabens! Tu acertou o número em %d tentativas!\n\n", tentativas);
					break;
				}

			} while (tentativas != 10);

			System.out.println("Digite 0 para sair, ou qualquer outro número para continuar: ");
			continuar = entrada.nextInt();

		} while (continuar != 0);

		entrada.close();
	}
}
