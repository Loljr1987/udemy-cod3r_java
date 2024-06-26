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

    }
}
