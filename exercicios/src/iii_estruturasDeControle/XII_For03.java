package iii_estruturasDeControle;

public class XII_For03 {

    public static void main(String[] args) {

    	
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        int i = 0;
//        System.out.println("Saiu do for...");
//        System.out.println(i); // como a variável foi definida fora do bloco ela pode ser acessada.
//        // ou criar outra variável fora do laço.
//        // não podemos usar a variável antes de declara-la, se não dá err    o.
//    }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("[%d %d]", i, j );
            }
            System.out.println();
        }
    }
}
