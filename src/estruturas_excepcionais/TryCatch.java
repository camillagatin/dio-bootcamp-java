package estruturas_excepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
        /*
        ! Possíveis exceções:
        Não informar o nome e sobrenome;
        O valor da idade ter um caractere NÃO numérico;
        O valor da altura ter uma vírgula ao invés de ser um ponto (conforme padrão americano);
        */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();  
        } catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numéricos no formato americano");
        }
    }
}