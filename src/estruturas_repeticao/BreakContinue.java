package estruturas_repeticao;

public class BreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue; // trocar break vice versa

            System.out.println(numero);
        }
    }
}
