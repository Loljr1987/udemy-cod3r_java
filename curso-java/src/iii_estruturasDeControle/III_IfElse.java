package iii_estruturasDeControle;

import javax.swing.JOptionPane;

public class III_IfElse {
	
	public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número: ");
        int numero = Integer.parseInt(valor);
        
// essa é uma maneira de apresentar o código        
//        if( numero % 2 == 0 ) {
//        	System.out.println("Número par!");
//        }
        
//        if(numero % 2 == 1 ) {
//        	System.out.println("Número ímpar");
//        }

// essa seria outra maneira e mais limpa de apresentar o código também
        if (numero % 2 == 0) {
            System.out.println("Número par!");
        } else {
            System.out.println("Número ímpar");
        }
    }
}
