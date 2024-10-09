package i_fundamentos;

import javax.swing.JOptionPane;

public class XIV_ConversaoStringsNumeros {

	public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog(
                "Digite um valor qualquer: ");
        String valor2 = JOptionPane.showInputDialog(
                "Digite um segundo valor qualquer: ");

        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média dos valores é: " + soma / 2);

    }
}
