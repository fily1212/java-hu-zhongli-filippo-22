package com.engim.lezione9.calcolatrice;

import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        System.out.println("Benvenuto nella calcolatrice. Inserisci un'espressione in notazione polacca inversa.");
        Scanner tastiera = new Scanner(System.in);
        while(tastiera.hasNext()){
            String inserito = tastiera.next();
            switch (inserito){
                case "+":
                    somma();
                    break;
                case "-":
                    differenza();
                    break;
                case "*":
                    moltiplicazione();
                    break;
                case "/":
                    divisione();
                    break;
                default:
                    aggiuntaNum();
            }
        }
    }

}
