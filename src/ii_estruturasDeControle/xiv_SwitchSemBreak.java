package ii_estruturasDeControle;

public class xiv_SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "marrom";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yopdan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Ainda não aprendi.");
		}
		
		System.err.println("Fim!");
	}
}
