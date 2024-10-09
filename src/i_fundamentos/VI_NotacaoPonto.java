package i_fundamentos;

public class VI_NotacaoPonto {
	
	public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora"); // 'repalce' é um comando de substituição.
        s = s.toUpperCase(); // deixa todas letras em maiúsculo
        s = s.concat("!!!"); // aqui já ocorre uma concatenação
        
        System.out.println(s);

        String x = "Luci".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", "Jaise")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // Tipos primitivos não tem o operador "."

        int a = 3;
        System.out.println(a);
    }
}
