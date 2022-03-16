package com.engim.lezione10.eccezioni;
/*Esempio di lancio di eccezione*/
public class EsempioThrow {

    public static void m1() throws Exception {
        throw new Exception("Errore");
    }

    public static void main(String[] args) {
        int c = 0;
        if(c == 0)
            throw new ArithmeticException("Errore");

        try{
            // SINTASSI
            throw new Exception("Errore");
        }catch(Exception e){

        }

        try {
            m1();
        }catch (Exception e){

        }
    }

}
