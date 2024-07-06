package sintaxejava.argumentos;

public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
/*Executando o programa agora no terminal:
A:
cd A:\Camilla\ESTUDOS\Bootcamps - DIO\Santander Backend com Java\PROJETOS\dio-bootcamp-java\bin
java Argumentos.AboutMe Camilla Gatin 22 1.65
*/