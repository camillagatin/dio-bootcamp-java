package sintaxejava.operadores;

public class Relacionais {
    public static void main(String[] args) {
        /*
        == Quando desejamos verificar se uma variável é IGUAL A outra.
        
        != Quando desejamos verificar se uma variável é DIFERENTE da outra.
        
        > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
        
        >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
        
        < Quando desejamos verificar se uma variável é MENOR QUE outra.
        
        <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
         */

        // classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2 \n");

        if (numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2 \n");

        if (numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2 \n");

        if (numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2 \n");

        if (numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2 \n");

/*------------------------------------------------------ */

        String nome1 = "JAVA";
        String nome2 = "JAVA";
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA"); // novo objeto
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        //equals compara o conteúdo dos objetos
        System.out.println(nome1.equals(nome2)); //??
        System.out.println(nome2.equals(nome3)); //??
        System.out.println(nome3.equals(nome4)); //??
    }
}

