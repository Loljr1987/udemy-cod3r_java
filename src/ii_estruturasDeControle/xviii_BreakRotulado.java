package ii_estruturasDeControle;

public class xviii_BreakRotulado {

	public static void main(String[] args) {
		
		externo:
		for (int i = 0; true; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1 ) {
					break externo;
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!");
	}
}
