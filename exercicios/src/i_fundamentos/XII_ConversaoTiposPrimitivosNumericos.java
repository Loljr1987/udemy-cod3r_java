package i_fundamentos;

public class XII_ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {

        double a = 1; // conversão inplícita
        System.out.println(a);

        float b = (float) 1.123456788888; // conversão explicita (casting)
        System.out.println(b);

        int c = 340;
        byte d = (byte) c; // conversão explícita (casting)
        System.out.println(d);

        double e = 1.9999999;
        int f = (int) e; // conversão explícita (casting)
        System.out.println(f);
    }
}
