package poo.construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        // criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Camilla", "39507200819");

        // definimos o endereço de marcos
        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
