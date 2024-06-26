package i_fundamentos;

public class V_TiposPrimitivos {

	public static void main(String[] args) {
        // Informações do funcionário

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        // Tipos númericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo boolean
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo (pode ser letra maiuscula ou minunscula

		/* char status '\u0010';  na tabela unicode cada símbolo tem um número
		pela orde que foi definido e tbm pode ser usada também essa nomeclatura
        */

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        //Numeros de Viagem
        System.out.println(numeroDeVoos / 2);

        //Pontos por reaal
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}