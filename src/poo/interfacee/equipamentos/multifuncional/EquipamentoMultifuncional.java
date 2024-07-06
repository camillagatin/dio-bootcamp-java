package poo.interfacee.equipamentos.multifuncional;

import poo.interfacee.equipamentos.copiadora.Copiadora;
import poo.interfacee.equipamentos.digitalizadora.Digitalizadora;
import poo.interfacee.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("copiando via equipamento multifuncional");
    }

    public void digitalizar() {
        System.out.println("digitalizando via equipamento multifuncional");
    }

    public void imprimir() {
        System.out.println("imprimindo via equipamento multifuncional");
    }
}
