package poo.pilares_poo.abstracao_polimorfismo;

public class Carro extends Veiculo{
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("carro ligado");
    }

    private void confereCombustivel() {
        System.out.println("conferindo combustível");
    }

    private void confereCambio() {
        System.out.println("conferindo cambio em P");
    }
}
