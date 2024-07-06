package sintaxejava.operadores;

public class Concatenacao {
    public static void main(String[] args) {
        
    String nomeCompleto = "LINGUAGEM" + "JAVA";
    System.out.println(nomeCompleto);

    String concatenacao = "?";
    
    concatenacao = 1 + 1 + 1 + "1";
    System.out.println("1ª: " + concatenacao);
    
    concatenacao = 1 + "1" + 1 + 1;
    System.out.println("2º: " + concatenacao);
    
    concatenacao = 1 + "1" + 1 + "1";
    System.out.println("3º: " + concatenacao);
    
    concatenacao = "1" + 1 + 1 + 1;
    System.out.println("4º: " + concatenacao);
    
    concatenacao = "1" + (1 + 1 + 1);
    System.out.println("5º: " + concatenacao);
    }
}
