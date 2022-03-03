package com.engim.lezione5;

public class Overloading {

    public static void stampa(int[] array){
        for(int i = 0 ; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void stampa(String[] array){
        for(int i = 0 ; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }


    public static void stampa(String[] array, int[] array2){
        for(int i = 0 ; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        stampa(a);
        String[] b = {"Cane", "Gatto", "Coniglio"};
        stampa(b);
    }
}
