package com.engim.lezione5;
/*
* fare due metodi: riempi(int q) e svuota(int q) che
* riempiono e svuotano la bottiglia della quantità q
* BottigliaConTappo
* boolean aperta
* apri() e chiudi()
*  */


public class Bottiglia {
    private int capacita;
    private int quantita;

    public Bottiglia(int capacita) {
        if(capacita < 0)
            this.capacita = 0;
        else
            this.capacita = capacita;
        this.quantita = 0;

    }
    public void riempi(int q){
//        quantita = q+quantita>capacita ? capacita : q+quantita;
        quantita = Math.min(q+quantita,capacita);
    }

    public void svuota(int q){
        quantita = Math.max(0, quantita-q);
    }

    public int getCapacita() {
        return capacita;
    }


    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "B[" +
                "capacita:" + capacita +
                ", quantita:" + quantita +
                ']';
    }
}
