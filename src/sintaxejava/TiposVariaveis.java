package sintaxejava;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String meuNome = "Camilla";
        System.out.println("Meu nome é " + meuNome);
        
        double salarioMinimo = 2500;
        System.out.println("Salário mínimo é " + salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println("O número é " + numeroCurto2);

        int numero = 5;
        numero = 10;
        System.out.println("Número inteiro " + numero);

        /* ao usar a palavra reservada final, você determina que jamais esta variavel poderá obter outro valor
		* isso é considerado uma CONSTANTE na linguagem Java */
        final double VALOR_DE_Pi = 3.14;
        System.out.println("Valor de PI: " + VALOR_DE_Pi);
    }
}
