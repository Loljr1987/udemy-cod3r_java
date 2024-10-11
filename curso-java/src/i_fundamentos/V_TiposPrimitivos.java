package i_fundamentos;

public class V_TiposPrimitivos {

	public static void main(String[] args) {
        // Informações do funcionário

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        // Tipos númericos reais (números com ponto flutuantes)
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano ( só aceita valores do tipo - verdadeiro ou falso)
        boolean estaDeFerias = false; // true

        // Tipo caractere ( só aceita uma única caractere)
        char status = 'A'; // ativo (pode ser letra maiuscula ou minunscula

		/* char status '\u0010';  na tabela unicode cada símbolo tem um número
		pela ordem que foi definido e pode ser usada também essa nomeclatura 
		*/

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Números de Viagem
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}