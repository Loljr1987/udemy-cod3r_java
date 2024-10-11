package i_fundamentos;

public class VIII_TipoString {
	
	public static void main(String[] args) {
        System.out.println("Olá Mundo!".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s + "!!!");
        System.out.println(s.startsWith("Boa")); // retorna o valor boolean
        System.out.println(s.toLowerCase().startsWith("boa")); // retorna também um valor boolean
        System.out.println(s.toUpperCase().endsWith("TARDE"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase().equals("olá mundo!"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));
        
        var nome = "Jaisielle";
        var sobrenome = "Lopes";
        var idade = 42;
        var salario = 12345.987;
        
        String frase1 = "Nome: " + nome + "\nSobrenome: " 
        		+ sobrenome + "\nIdade: " + idade + 
        		"\nSalário: " + salario + "\n\n";
        System.out.println(frase1);
        
        System.out.printf("A senhora %s %s tem %d anos e ganha R$%.2f.",
        		nome, sobrenome, idade, salario);
        
        String frase2 = String.format("\nA senhora %s %s tem %d anos e ganha R$%.2f.",
        		nome, sobrenome, idade, salario);
        System.out.printf(frase2 + "\n\n");
        
        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".indexOf("qual"));
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10));

    }
}
