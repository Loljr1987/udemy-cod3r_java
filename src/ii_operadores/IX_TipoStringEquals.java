package ii_operadores;

import java.util.Scanner;

public class IX_TipoStringEquals {

    public static void main(String[] args) {

        System.out.println("2" == "2");

        String s1 = new String("2");
        System.out.println("2" == s1); // não são iguais, embora o conteudo seja.
        System.out.println("2".equals(s1)); // Nesse caso, ele compara o conteúdo de cada string.

        Scanner entrada = new Scanner(System.in);

        String s2 = entrada.next();
        System.out.println("2" == s2.trim()); // a tag "trim" não leva em consideração, espaços em branco.
        System.out.println("2".equals(s2.trim()));

//		Muito cuidado na comparação entre strings com o operador "==",
//		pois ele nem sempre irá comparar a string em sim o valor
//		que está atribuido a ela, do contrário poderá retornar erro.
//		O mais correto é usar o ".equals".

        entrada.close();
    }
}
