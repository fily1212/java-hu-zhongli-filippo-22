package com.engim.lezione8;

public class EsListe {
    public static void main(String[] args) {
        Nil nil = new Nil();
        List lista = new Node(new Node(new Node(nil,1),2),3);
       // System.out.println(lista.get(2));
        lista.add(0,4);
        System.out.println(lista);
        System.out.println(lista.length());
    }
}
