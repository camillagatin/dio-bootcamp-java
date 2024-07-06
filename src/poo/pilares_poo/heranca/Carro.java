package poo.pilares_poo.heranca;

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
