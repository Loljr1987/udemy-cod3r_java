package i_fundamentos;

import java.util.Date;

public class VII_Import {

    public static void main(String[] args) {
        java.lang.String b = "Boa Noite!";
        java.lang.System.out.println(b);

        String s = "Boa Noite.";
        System.out.println(s);

        Date d = new Date();
        System.out.println(d);

        // JButton botao = new JButton();
        // ctrl + shift + o = ele organiza os imports, tirando o que não precisa e adicionnado o nescessário
    }
}   