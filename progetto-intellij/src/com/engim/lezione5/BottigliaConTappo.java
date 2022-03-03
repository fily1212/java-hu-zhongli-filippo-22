package com.engim.lezione5;

public class BottigliaConTappo extends Bottiglia{
    private boolean aperta;

    public BottigliaConTappo(int capacita) {
        super(capacita);
        aperta = true;
    }

    public BottigliaConTappo(int capacita, boolean aperta){
        super(capacita);
        this.aperta = aperta;
    }

    public void apri(){
        aperta = true;
    }
    public void chiudi(){
        aperta = false;
    }

    @Override
    public void riempi(int q) {
        if(aperta)
            super.riempi(q);
    }

    @Override
    public void svuota(int q) {
        if(aperta)
            super.svuota(q);
    }
}
