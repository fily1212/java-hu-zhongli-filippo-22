package com.engim.lezione12.es_mvc;

import java.util.Scanner;

/*
* Scrivere un programma seguendo il pattern MVC
* che chieda in ingresso, mostri o consenta la cancellazione della lista della spesa.
* Ogni elemento è univoco (non è consentito avere più volte lo stesso elemento).
* È consentito avere più liste della spesa e ogni lista ha un nome univoco
* (cioè non è consentito avere più liste con lo stesso nome).
* Per la view utilizzare il terminale.

Per il mantenimento dei dati creare un'interfaccia chiamata SpesaRepository che abbia i seguenti metodi:
- getListe(): List<String>
- findListaByNome(nome: String): List<String>
- removeListaByNome(nome: String): boolean
- addLista(nome: String): boolean
- addElemToLista(elem: String): boolean
- removeElemToLista(elem: String): boolean

*/
public class Main {
    public static void main(String[] args) {
        System.out.println("Benvenuto nel programma Lista della spesa");
        boolean finito = false;
        Scanner tastiera = new Scanner(System.in);
        while(!finito){
            System.out.println("Cosa vuoi fare? \n" +
                    "1. leggere i nomi delle liste\n" +
                    "2. aggiungere una lista\n" +
                    "3. cancellare una lista\n" +
                    "4. leggere il contenuto di una lista\n" +
                    "5. aggiungere un elemento in una lista\n" +
                    "6. cancellare un elemento in una lista.");
            String risposta = tastiera.nextLine();
            switch (risposta){
                case "1":
                    nomiListe();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Hai sbagliato ad inserire");
            }
        }
    }

    private static void nomiListe() {

    }
}
