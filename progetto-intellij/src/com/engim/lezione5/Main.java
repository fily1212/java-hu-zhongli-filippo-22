package com.engim.lezione5;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bottiglia b1 = new Bottiglia(1500);
        System.out.println(b1);
        b1.riempi(500);
        System.out.println(b1);
        b1.svuota(200);
        System.out.println(b1);
        Bottiglia b2 = new BottigliaConTappo(1500);
       // b2.apri();
        b2.svuota(500);

    }
}
