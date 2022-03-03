package com.engim.lezione5.forme;

public class Main {
    public static void main(String[] args){
        Quadrato q = new Quadrato(5);
        System.out.println(q.area());
        Quadrato q2 = q;
        Rettangolo r = q;
        Rettangolo r2 = new Quadrato(5);
        Quadrato q3 = (Quadrato)r2;

    }
}
