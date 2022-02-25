package com.engim.lezione5;

public class BottigliaConTappo extends Bottiglia{
    private boolean aperta;

    public BottigliaConTappo(int capacita) {
        super(capacita);
        aperta = true;
    }

    public void apri(){
        aperta = true;
    }
    public void chiudi(){
        aperta = false;
    }
}
