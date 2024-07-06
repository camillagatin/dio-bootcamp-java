package poo.pilares_poo.abstracao_polimorfismo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("989562");
        // jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("45874126");
        // z400.ligar();

        // Veiculo coringa = jeep;
        // Veiculo coringa = z400;
        // coringa.ligar();
    }
}
