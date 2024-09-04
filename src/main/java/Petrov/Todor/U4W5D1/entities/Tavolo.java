package Petrov.Todor.U4W5D1.entities;

import Petrov.Todor.U4W5D1.entities.enums.StatoTavolo;
import lombok.Setter;

public class Tavolo {
    @Setter
    private int numero;
    @Setter
    private int copertiMax;
    private StatoTavolo stato;

    public Tavolo(int numero, int copertiMax) {
        this.numero = numero;
        this.copertiMax = copertiMax;
        this.stato = StatoTavolo.LIBERO;

    }

    public int getNumero() {
        return numero;
    }

    public int getCopertiMax() {
        return copertiMax;
    }

    public StatoTavolo getStato() {
        return stato;
    }

    public void setStato(StatoTavolo stato) {
        if (this.numero > 0) {
            this.stato = StatoTavolo.OCCUPATO;
        }
    }

    @Override
    public String toString() {
        return "Tavolo{" +
                "numero=" + numero +
                ", copertiMax=" + copertiMax +
                ", stato=" + stato +
                '}';
    }
}
