package poo.interfacee.estabelecimento;

import poo.interfacee.equipamentos.copiadora.Copiadora;
import poo.interfacee.equipamentos.digitalizadora.Digitalizadora;
import poo.interfacee.equipamentos.impressora.Impressora;
import poo.interfacee.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
