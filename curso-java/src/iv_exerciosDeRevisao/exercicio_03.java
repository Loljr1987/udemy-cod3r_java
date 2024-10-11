package iv_exerciosDeRevisao;

import java.util.Scanner;

public class exercicio_03 {
	
	/**
	 * Criar um programa que receba duas notas parciais e calcular a média a final. 
	 * Se a nota do aluno for maior ou igual a 7.0 imprime no console: "Aprovado", 
	 * se a nota for menor que 7.0 e maior do que 4.0 imprime no console: "Recuperação".
	 * No caso de se diferente das anteriores, imprime no console: "Reprovado".
	 */

		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);

			System.out.println("Primeira Parcial: ");
			double parcial1 = entrada.nextDouble();
			
			System.out.println("Segunda Parcial: ");
			double parcial2 = entrada.nextDouble();
			
			double media = (parcial1 + parcial2) / 2;
			
			if (media >= 7) {
				System.out.println("A tua média foi: " + media + ". Parabéns, estás: Aprovado !!!");
			} else if (media >= 4) {
				System.out.println("A Tua média foi: " + media + ". então ficastes em Recuperação.");
			} else {
				System.out.println("Infelizmente tua média foi: " + media + ". e com isso estás Reprovado. !!!");
			}

			entrada.close();
		}
}
