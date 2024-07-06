package sintaxejava.operadores;

public class Unarios {
    public static void main(String[] args) {

        int numero = 5;
        int numero2 = 10;

        //* Imprimindo o número negativo
        System.out.println("Imprimindo o número negativo: " + - numero);

        //* Imprimindo o número positivo
        numero = - numero;
        System.out.println("Imprimindo o número positivo: " + numero * -1 );

        //* Incrementando número em mais 1 número
        numero2++;
        System.out.println("Incrementando número: " + numero2);

        //* Incrementando número em mais 1 numero
        System.out.println("Incrementando novamente: " + numero2++ + " novo valor: " + numero2); // primeiro imprime o valor e depois o incrementa
        // para imprimir o valor novo de uma vez colocamos o operário como prefixo
        System.out.println("Incrementação direta: " + ++ numero2);


        boolean variavel = true;
        System.out.println("Original: " + variavel);

        System.out.println("Inverteu: " + !variavel);
    }
}