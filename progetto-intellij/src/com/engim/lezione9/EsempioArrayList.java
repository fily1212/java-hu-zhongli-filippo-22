package com.engim.lezione9;

import java.util.ArrayList;

public class EsempioArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringhe = new ArrayList<>();
        // equivalente a
        ArrayList<String> stringhe2 = new ArrayList<String>();
        stringhe.add("Ciao");
        stringhe.add("Hello");
        stringhe.remove(1);
        System.out.println(stringhe);
        ArrayList<Persona> persone = new ArrayList<>();
        persone.add(new Persona("Pippo", "P"));
        System.out.println(persone);
        for (String s : stringhe){
            System.out.println(s + " ");
        }
        System.out.println(stringhe.contains("Ciao"));
        System.out.println(stringhe.contains("Hola"));
    }
}
